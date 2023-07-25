// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class TagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The region ID of the tags.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource IDs. You can add tags to up to 50 resources.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <br>
     * <p>*   `ACS::Config::Rule`</p>
     * <p>*   `ACS::Config::AggregateConfigRule`</p>
     * <p>*   `ACS::Config::Aggregator`</p>
     * <p>*   `ACS::Config::CompliancePack`</p>
     * <p>*   `ACS::Config::AggregateCompliancePack`</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag value of the resource.</p>
     * <br>
     * <p>You can specify up to 20 tag values.</p>
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
