// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags. This parameter is valid only when the **Tagkeys** is empty. Valid values:</p>
     * <br>
     * <p>*   true: All the data is deleted.</p>
     * <p>*   false: Not all of them are deleted.</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The ID of the region in which you want to create the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of resource IDs.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The type of the resource. Set the value to cluster.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The key of the label. Valid values of N: 1 to 20.</p>
     */
    @NameInMap("TagKeys")
    public java.util.List<String> tagKeys;

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

}
