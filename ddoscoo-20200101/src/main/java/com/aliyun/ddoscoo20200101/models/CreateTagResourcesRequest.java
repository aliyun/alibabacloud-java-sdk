// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateTagResourcesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("Tags")
    public java.util.List<CreateTagResourcesRequestTags> tags;

    public static CreateTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTagResourcesRequest self = new CreateTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public CreateTagResourcesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
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

    public CreateTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateTagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public CreateTagResourcesRequest setTags(java.util.List<CreateTagResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateTagResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateTagResourcesRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

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
