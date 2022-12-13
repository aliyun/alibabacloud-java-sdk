// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    // Specifies whether to unbind all tags from the resource. This parameter takes effect only when the TagKey.N parameter is not specified. Default value: false.
    @NameInMap("All")
    public Boolean all;

    // The region ID of the resource.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource, which is the ID of the cloud desktop. Valid values of N: 1 to 50.
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    // The type of the resource. Set the value to ALIYUN::GWS::INSTANCE.
    @NameInMap("ResourceType")
    public String resourceType;

    // The key of tag N. Valid values of N: 1 to 20.
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

    public UntagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
