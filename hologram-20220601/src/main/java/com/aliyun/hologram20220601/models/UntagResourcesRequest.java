// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("category")
    public String category;

    @NameInMap("resourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <strong>example:</strong>
     * <p>INSTANCe</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("tagKeys")
    public java.util.List<String> tagKeys;

    /**
     * <strong>example:</strong>
     * <p>1062017779051424</p>
     */
    @NameInMap("tagOwnerUid")
    public Long tagOwnerUid;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UntagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

    public UntagResourcesRequest setTagOwnerUid(Long tagOwnerUid) {
        this.tagOwnerUid = tagOwnerUid;
        return this;
    }
    public Long getTagOwnerUid() {
        return this.tagOwnerUid;
    }

}
