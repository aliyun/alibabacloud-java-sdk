// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class TagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource ID.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource in CloudConfig. Valid values:</p>
     * <ul>
     * <li><p><code>ACS::Config::Rule</code>: a rule for a single account.</p>
     * </li>
     * <li><p><code>ACS::Config::AggregateConfigRule</code>: a rule for multiple accounts.</p>
     * </li>
     * <li><p><code>ACS::Config::Aggregator</code>: an account group.</p>
     * </li>
     * <li><p><code>ACS::Config::CompliancePack</code>: a compliance package for a single account.</p>
     * </li>
     * <li><p><code>ACS::Config::AggregateCompliancePack</code>: a compliance package for multiple accounts.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::Config::Rule</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can attach a maximum of 20 tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    public static TagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesShrinkRequest self = new TagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesShrinkRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
