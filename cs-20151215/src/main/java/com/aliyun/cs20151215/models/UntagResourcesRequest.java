// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all custom labels. This parameter takes effect only when `tag_keys` is left empty. Valid values:</p>
     * <br>
     * <p>*   `true`: Remove all custom labels.</p>
     * <p>*   `false`: Do not remove all custom labels.</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>The region ID of the resources.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The list of resource IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("resource_ids")
    public java.util.List<String> resourceIds;

    /**
     * <p>The type of resource. Set the value to `CLUSTER`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("resource_type")
    public String resourceType;

    /**
     * <p>The list of keys of the labels that you want to remove.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("tag_keys")
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
