// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to detach all tags from the resource. This parameter only takes effect when the TagKey.N parameter is not configured. Default value: **false**.</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The ID of the region in which the resource is deployed.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the resources from which you want to detach tags.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resources. Valid values:</p>
     * <br>
     * <p>*   **INSTANCE**</p>
     * <p>*   **TOPIC**</p>
     * <p>*   **CONSUMERGROUP**</p>
     * <br>
     * <p>>  The value of this parameter is not case-sensitive.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag key.</p>
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
