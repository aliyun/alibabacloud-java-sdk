// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class TagResourcesSystemTagsRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TagOwnerUid")
    public Long tagOwnerUid;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("Tag")
    public java.util.List<TagResourcesSystemTagsRequestTag> tag;

    public static TagResourcesSystemTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesSystemTagsRequest self = new TagResourcesSystemTagsRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesSystemTagsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TagResourcesSystemTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesSystemTagsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesSystemTagsRequest setTagOwnerUid(Long tagOwnerUid) {
        this.tagOwnerUid = tagOwnerUid;
        return this;
    }
    public Long getTagOwnerUid() {
        return this.tagOwnerUid;
    }

    public TagResourcesSystemTagsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public TagResourcesSystemTagsRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesSystemTagsRequest setTag(java.util.List<TagResourcesSystemTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesSystemTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class TagResourcesSystemTagsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static TagResourcesSystemTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesSystemTagsRequestTag self = new TagResourcesSystemTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesSystemTagsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesSystemTagsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
