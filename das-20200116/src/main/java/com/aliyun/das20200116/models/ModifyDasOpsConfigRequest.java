// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifyDasOpsConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable DAS Alibaba Cloud Managed Services. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable.</li>
     * <li><strong>false</strong>: Disable. Shutdown only turns off the feature but does not unsubscribe from the service. To unsubscribe, go to the unsubscription management page.</li>
     * </ul>
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
    public java.util.List<ModifyDasOpsConfigRequestFilters> filters;

    /**
     * <p>The database instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-uf6079bda570****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyDasOpsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDasOpsConfigRequest self = new ModifyDasOpsConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDasOpsConfigRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifyDasOpsConfigRequest setFilters(java.util.List<ModifyDasOpsConfigRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ModifyDasOpsConfigRequestFilters> getFilters() {
        return this.filters;
    }

    public ModifyDasOpsConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class ModifyDasOpsConfigRequestFilters extends TeaModel {
        /**
         * <p>The filter parameter.</p>
         * <blockquote>
         * <p>For supported filter parameters and their values, see <strong>Supplementary description of request parameters</strong>.</p>
         * </blockquote>
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
         * <p>select</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyDasOpsConfigRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ModifyDasOpsConfigRequestFilters self = new ModifyDasOpsConfigRequestFilters();
            return TeaModel.build(map, self);
        }

        public ModifyDasOpsConfigRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyDasOpsConfigRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
