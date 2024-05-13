// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The region ID of the resource.</p>
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
     * <p>The type of resource that you want to label. Set the value to `CLUSTER`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("resource_type")
    public String resourceType;

    /**
     * <p>The labels that you want to add to the resources in key-value pairs. You can add up to 20 labels. Usage notes:</p>
     * <br>
     * <p>*   Label values must not be empty strings. A label value must be 1 to 128 characters in length.</p>
     * <p>*   The label value must not start with `aliyun` or `acs:`.</p>
     * <p>*   The label value must not contain `http://` or `https://`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
