// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class CreateAccountFactoryBaselineRequest extends TeaModel {
    @NameInMap("BaselineItems")
    public java.util.List<CreateAccountFactoryBaselineRequestBaselineItems> baselineItems;

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

    public static CreateAccountFactoryBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountFactoryBaselineRequest self = new CreateAccountFactoryBaselineRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountFactoryBaselineRequest setBaselineItems(java.util.List<CreateAccountFactoryBaselineRequestBaselineItems> baselineItems) {
        this.baselineItems = baselineItems;
        return this;
    }
    public java.util.List<CreateAccountFactoryBaselineRequestBaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    public CreateAccountFactoryBaselineRequest setBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }
    public String getBaselineName() {
        return this.baselineName;
    }

    public CreateAccountFactoryBaselineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAccountFactoryBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateAccountFactoryBaselineRequestBaselineItems extends TeaModel {
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

        public static CreateAccountFactoryBaselineRequestBaselineItems build(java.util.Map<String, ?> map) throws Exception {
            CreateAccountFactoryBaselineRequestBaselineItems self = new CreateAccountFactoryBaselineRequestBaselineItems();
            return TeaModel.build(map, self);
        }

        public CreateAccountFactoryBaselineRequestBaselineItems setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public CreateAccountFactoryBaselineRequestBaselineItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAccountFactoryBaselineRequestBaselineItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
