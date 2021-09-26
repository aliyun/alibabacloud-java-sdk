// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class TagResourcesSystemTagsRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    // 资源类型：cluster
    @NameInMap("ResourceType")
    public String resourceType;

    // 主账号UID
    @NameInMap("TagOwnerUid")
    public Long tagOwnerUid;

    @NameInMap("Scope")
    public String scope;

    // 资源标签
    @NameInMap("Tags")
    public java.util.List<TagResourcesSystemTagsRequestTags> tags;

    // 资源ID
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

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

    public TagResourcesSystemTagsRequest setTags(java.util.List<TagResourcesSystemTagsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<TagResourcesSystemTagsRequestTags> getTags() {
        return this.tags;
    }

    public TagResourcesSystemTagsRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public static class TagResourcesSystemTagsRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static TagResourcesSystemTagsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesSystemTagsRequestTags self = new TagResourcesSystemTagsRequestTags();
            return TeaModel.build(map, self);
        }

        public TagResourcesSystemTagsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesSystemTagsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
