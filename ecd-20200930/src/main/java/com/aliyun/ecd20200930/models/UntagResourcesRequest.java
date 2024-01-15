// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to unbind all tags from the resource. This parameter takes effect only when TagKey.N is not specified. Default value: false.</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource IDs, namely the cloud desktop IDs. Valid values of N: 1 to 50.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Valid value: ALIYUN::GWS::INSTANCE.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag key. You can specify up to 20 tag keys.</p>
     */
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
