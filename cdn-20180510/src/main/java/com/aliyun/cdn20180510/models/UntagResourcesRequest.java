// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    // Specifies whether to delete all tags. Valid values:
    // 
    // *   **true**: yes.
    // *   **false**: no.
    // 
    // Default value: **false**.
    @NameInMap("All")
    public Boolean all;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The list of resource ID. The max items count is up to 20.
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    // The type of resource. The resource type. Set the value to **DOMAIN**.
    @NameInMap("ResourceType")
    public String resourceType;

    // The list of tag key.
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UntagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
