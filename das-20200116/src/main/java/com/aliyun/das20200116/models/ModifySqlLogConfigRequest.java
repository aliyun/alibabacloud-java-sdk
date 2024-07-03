// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySqlLogConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable DAS Enterprise Edition. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if you want to enable DAS Enterprise Edition. By default, the latest version of DAS Enterprise Edition that supports the database instance is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ModifySqlLogConfigRequestFilters> filters;

    /**
     * <p>The number of days for which the SQL Explorer and Audit data is stored in hot storage. Valid values: 1 to 7.</p>
     * <blockquote>
     * <p> This parameter is required if only DAS Enterprise Edition V3 can be enabled for the database instance.</p>
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
     * <p>rr-2ze770smbq3tpr2o9</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to enable the SQL Explorer feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if only DAS Enterprise Edition V3 can be enabled for the database instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RequestEnable")
    public Boolean requestEnable;

    /**
     * <p>The total storage duration of the SQL Explorer and Audit data. Unit: day. Valid values:</p>
     * <ul>
     * <li>7</li>
     * <li>30</li>
     * <li>180</li>
     * <li>365</li>
     * </ul>
     * <blockquote>
     * <p> If you want to enable DAS Enterprise Edition V3, the value of this parameter must be greater than or equal to 30.</p>
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
