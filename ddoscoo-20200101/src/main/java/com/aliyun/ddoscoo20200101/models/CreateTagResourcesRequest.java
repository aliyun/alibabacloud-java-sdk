// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateTagResourcesRequest extends TeaModel {
    /**
     * <p>The region ID of the instance. Set the value to <strong>cn-hangzhou</strong>, which indicates an Anti-DDoS Proxy (Chinese Mainland) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IDs of the Anti-DDoS Proxy (Chinese Mainland) instances to which you want to add the tag.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The type of the resource to which the tag belongs. Set the value to <strong>INSTANCE</strong>, which indicates an Anti-DDoS Pro instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>An array that consists of the tags to add.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateTagResourcesRequestTags> tags;

    public static CreateTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTagResourcesRequest self = new CreateTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public CreateTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTagResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public CreateTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateTagResourcesRequest setTags(java.util.List<CreateTagResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateTagResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateTagResourcesRequestTags extends TeaModel {
        /**
         * <p>The key of the tag to add.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag to add.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTagResourcesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateTagResourcesRequestTags self = new CreateTagResourcesRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateTagResourcesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTagResourcesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
