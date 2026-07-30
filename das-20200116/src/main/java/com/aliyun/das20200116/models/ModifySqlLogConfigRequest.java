// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySqlLogConfigRequest extends TeaModel {
    /**
     * <p>Indicates whether to enable DAS Enterprise Edition. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables DAS Enterprise Edition.</p>
     * </li>
     * <li><p><strong>false</strong>: disables DAS Enterprise Edition.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you enable DAS Enterprise Edition. By default, this operation enables the latest supported version.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>Indicates whether to enable security audit.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ModifySqlLogConfigRequestFilters> filters;

    /**
     * <p>The hot storage retention period, in days. The value must be an integer from 1 to 7.</p>
     * <blockquote>
     * <p>This parameter is required only if you enable DAS Enterprise Edition V3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HotRetention")
    public Integer hotRetention;

    /**
     * <p>The ID of the database instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rr-2ze770smbq3tp****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether to enable SQL Explorer. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables SQL Explorer.</p>
     * </li>
     * <li><p><strong>false</strong>: disables SQL Explorer.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only if you enable DAS Enterprise Edition V3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RequestEnable")
    public Boolean requestEnable;

    /**
     * <p>The data retention period, in days. Valid values:</p>
     * <ul>
     * <li><p>7</p>
     * </li>
     * <li><p>30</p>
     * </li>
     * <li><p>180</p>
     * </li>
     * <li><p>365</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you enable DAS Enterprise Edition V3, the value of this parameter must be 30 or greater.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Retention")
    public Integer retention;

    public static ModifySqlLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySqlLogConfigRequest self = new ModifySqlLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifySqlLogConfigRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifySqlLogConfigRequest setEnableAudit(Boolean enableAudit) {
        this.enableAudit = enableAudit;
        return this;
    }
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    public ModifySqlLogConfigRequest setFilters(java.util.List<ModifySqlLogConfigRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ModifySqlLogConfigRequestFilters> getFilters() {
        return this.filters;
    }

    public ModifySqlLogConfigRequest setHotRetention(Integer hotRetention) {
        this.hotRetention = hotRetention;
        return this;
    }
    public Integer getHotRetention() {
        return this.hotRetention;
    }

    public ModifySqlLogConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySqlLogConfigRequest setRequestEnable(Boolean requestEnable) {
        this.requestEnable = requestEnable;
        return this;
    }
    public Boolean getRequestEnable() {
        return this.requestEnable;
    }

    public ModifySqlLogConfigRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public static class ModifySqlLogConfigRequestFilters extends TeaModel {
        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifySqlLogConfigRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ModifySqlLogConfigRequestFilters self = new ModifySqlLogConfigRequestFilters();
            return TeaModel.build(map, self);
        }

        public ModifySqlLogConfigRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifySqlLogConfigRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
