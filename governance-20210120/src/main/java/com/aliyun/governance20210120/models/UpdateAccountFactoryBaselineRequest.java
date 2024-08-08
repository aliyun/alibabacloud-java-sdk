// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class UpdateAccountFactoryBaselineRequest extends TeaModel {
    @NameInMap("BaselineId")
    public String baselineId;

    @NameInMap("BaselineItems")
    public java.util.List<UpdateAccountFactoryBaselineRequestBaselineItems> baselineItems;

    @NameInMap("BaselineName")
    public String baselineName;

    @NameInMap("Description")
    public String description;

    /**
     * <p>RegionId</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateAccountFactoryBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountFactoryBaselineRequest self = new UpdateAccountFactoryBaselineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccountFactoryBaselineRequest setBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public String getBaselineId() {
        return this.baselineId;
    }

    public UpdateAccountFactoryBaselineRequest setBaselineItems(java.util.List<UpdateAccountFactoryBaselineRequestBaselineItems> baselineItems) {
        this.baselineItems = baselineItems;
        return this;
    }
    public java.util.List<UpdateAccountFactoryBaselineRequestBaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    public UpdateAccountFactoryBaselineRequest setBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }
    public String getBaselineName() {
        return this.baselineName;
    }

    public UpdateAccountFactoryBaselineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAccountFactoryBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateAccountFactoryBaselineRequestBaselineItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;EnabledServices\&quot;:[\&quot;CEN_TR\&quot;,\&quot;CDT\&quot;,\&quot;CMS\&quot;,\&quot;KMS\&quot;]}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static UpdateAccountFactoryBaselineRequestBaselineItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateAccountFactoryBaselineRequestBaselineItems self = new UpdateAccountFactoryBaselineRequestBaselineItems();
            return TeaModel.build(map, self);
        }

        public UpdateAccountFactoryBaselineRequestBaselineItems setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public UpdateAccountFactoryBaselineRequestBaselineItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAccountFactoryBaselineRequestBaselineItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
