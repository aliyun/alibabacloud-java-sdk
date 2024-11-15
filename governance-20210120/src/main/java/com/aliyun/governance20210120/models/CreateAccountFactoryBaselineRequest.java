// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class CreateAccountFactoryBaselineRequest extends TeaModel {
    /**
     * <p>The baseline items.</p>
     * <p>You can call the <a href="~~ListAccountFactoryBaselineItems~~">ListAccountFactoryBaselineItems</a> operation to query a list of baseline items supported by the account factory in Cloud Governance Center.</p>
     */
    @NameInMap("BaselineItems")
    public java.util.List<CreateAccountFactoryBaselineRequestBaselineItems> baselineItems;

    /**
     * <p>The name of the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("BaselineName")
    public String baselineName;

    /**
     * <p>The description of the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>Default Baseline.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The region ID.</p>
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
         * <p>The configurations of the baseline item. The value of this parameter is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;EnabledServices\&quot;:[\&quot;CEN_TR\&quot;,\&quot;CDT\&quot;,\&quot;CMS\&quot;,\&quot;KMS\&quot;]}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The name of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version of the baseline item.</p>
         * 
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
