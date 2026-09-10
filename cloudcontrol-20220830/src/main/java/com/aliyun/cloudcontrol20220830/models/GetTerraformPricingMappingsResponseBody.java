// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetTerraformPricingMappingsResponseBody extends TeaModel {
    /**
     * <p>The mapping content version, which is the timestamp of the most recent data change. Consumers can use this value for caching and auditing.</p>
     * 
     * <strong>example:</strong>
     * <p>1786000000000</p>
     */
    @NameInMap("mappingVersion")
    public String mappingVersion;

    /**
     * <p>The list of matched mappings. Each item contains a resourceType and pricingTargets, which include pricing targets and parameter extraction rules. The rules reference Terraform plan resource properties by using $after/$before.</p>
     */
    @NameInMap("mappings")
    public java.util.List<GetTerraformPricingMappingsResponseBodyMappings> mappings;

    /**
     * <p>The resource types in the request that do not have registered mappings. Consumers must treat these as unknown cost. Do not assume they are free.</p>
     */
    @NameInMap("missingResourceTypes")
    public java.util.List<String> missingResourceTypes;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AF0AD89-ED4F-5E9E-8B7B-9A3B27CE9E1B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The schema version of the mapping catalog. The current version is 1.0. Consumers use this value to determine compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("schemaVersion")
    public String schemaVersion;

    /**
     * <p>The resource types that are confirmed to not support pricing, such as free resources or resources without a pricing interface. These are different from missing resource types.</p>
     */
    @NameInMap("unsupportedResourceTypes")
    public java.util.List<String> unsupportedResourceTypes;

    public static GetTerraformPricingMappingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTerraformPricingMappingsResponseBody self = new GetTerraformPricingMappingsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTerraformPricingMappingsResponseBody setMappingVersion(String mappingVersion) {
        this.mappingVersion = mappingVersion;
        return this;
    }
    public String getMappingVersion() {
        return this.mappingVersion;
    }

    public GetTerraformPricingMappingsResponseBody setMappings(java.util.List<GetTerraformPricingMappingsResponseBodyMappings> mappings) {
        this.mappings = mappings;
        return this;
    }
    public java.util.List<GetTerraformPricingMappingsResponseBodyMappings> getMappings() {
        return this.mappings;
    }

    public GetTerraformPricingMappingsResponseBody setMissingResourceTypes(java.util.List<String> missingResourceTypes) {
        this.missingResourceTypes = missingResourceTypes;
        return this;
    }
    public java.util.List<String> getMissingResourceTypes() {
        return this.missingResourceTypes;
    }

    public GetTerraformPricingMappingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTerraformPricingMappingsResponseBody setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public GetTerraformPricingMappingsResponseBody setUnsupportedResourceTypes(java.util.List<String> unsupportedResourceTypes) {
        this.unsupportedResourceTypes = unsupportedResourceTypes;
        return this;
    }
    public java.util.List<String> getUnsupportedResourceTypes() {
        return this.unsupportedResourceTypes;
    }

    public static class GetTerraformPricingMappingsResponseBodyMappings extends TeaModel {
        /**
         * <p>The list of pricing targets. Each item contains actions (create/update), popCode/popVersion/apiName, pricingUnit, params (parameter extraction rules: from=$after.xxx / const / default / expand), and when/whenChanged conditions.</p>
         */
        @NameInMap("pricingTargets")
        public java.util.List<java.util.Map<String, ?>> pricingTargets;

        /**
         * <p>The Terraform resource type, such as alicloud_instance.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_instance</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static GetTerraformPricingMappingsResponseBodyMappings build(java.util.Map<String, ?> map) throws Exception {
            GetTerraformPricingMappingsResponseBodyMappings self = new GetTerraformPricingMappingsResponseBodyMappings();
            return TeaModel.build(map, self);
        }

        public GetTerraformPricingMappingsResponseBodyMappings setPricingTargets(java.util.List<java.util.Map<String, ?>> pricingTargets) {
            this.pricingTargets = pricingTargets;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPricingTargets() {
            return this.pricingTargets;
        }

        public GetTerraformPricingMappingsResponseBodyMappings setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
