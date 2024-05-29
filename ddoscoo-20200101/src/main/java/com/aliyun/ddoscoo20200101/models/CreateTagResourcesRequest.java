// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateTagResourcesRequest extends TeaModel {
    /**
     * <p>The region ID of the instance. Set the value to **cn-hangzhou**, which indicates an Anti-DDoS Pro instance in the Chinese mainland.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>An array consisting of the IDs of the Anti-DDoS Pro instances to which you want to add the tag.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The type of the resource to which the tag belongs. Set the value to **INSTANCE**, which indicates an Anti-DDoS Pro instance.</p>
     * <br>
     * <p>This parameter is required.</p>
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
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag to add.</p>
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
