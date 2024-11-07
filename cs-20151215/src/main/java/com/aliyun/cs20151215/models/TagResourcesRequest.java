// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the region in which the resource resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The list of resource IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("resource_ids")
    public java.util.List<String> resourceIds;

    /**
     * <p>The type of resources that you want to label. Valid value: <code>CLUSTER</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLUSTER</p>
     */
    @NameInMap("resource_type")
    public String resourceType;

    /**
     * <p>The tags that you want to add to the resources in key-value pairs. You can add up to 20 key-value pairs. Note:</p>
     * <ul>
     * <li>The values must not be empty strings. A value must be 1 to 128 characters in length.</li>
     * <li>A key or value must not start with <code>aliyun</code> or <code>acs:</code>.</li>
     * <li>A key or value must not contain <code>http://</code> or <code>https://</code>.</li>
     * </ul>
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
