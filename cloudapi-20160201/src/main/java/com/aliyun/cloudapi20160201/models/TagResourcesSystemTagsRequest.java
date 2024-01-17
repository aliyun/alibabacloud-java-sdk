// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class TagResourcesSystemTagsRequest extends TeaModel {
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Tag")
    public java.util.List<TagResourcesSystemTagsRequestTag> tag;

    @NameInMap("TagOwnerBid")
    public String tagOwnerBid;

    @NameInMap("TagOwnerUid")
    public Long tagOwnerUid;

    public static TagResourcesSystemTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesSystemTagsRequest self = new TagResourcesSystemTagsRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesSystemTagsRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesSystemTagsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesSystemTagsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public TagResourcesSystemTagsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public TagResourcesSystemTagsRequest setTag(java.util.List<TagResourcesSystemTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesSystemTagsRequestTag> getTag() {
        return this.tag;
    }

    public TagResourcesSystemTagsRequest setTagOwnerBid(String tagOwnerBid) {
        this.tagOwnerBid = tagOwnerBid;
        return this;
    }
    public String getTagOwnerBid() {
        return this.tagOwnerBid;
    }

    public TagResourcesSystemTagsRequest setTagOwnerUid(Long tagOwnerUid) {
        this.tagOwnerUid = tagOwnerUid;
        return this;
    }
    public Long getTagOwnerUid() {
        return this.tagOwnerUid;
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
