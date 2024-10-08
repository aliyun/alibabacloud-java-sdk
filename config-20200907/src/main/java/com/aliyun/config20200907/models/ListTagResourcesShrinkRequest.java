// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListTagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJ****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the tag.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource ID.</p>
     * <p>You can add tags to up to 50 resources.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><code>ACS::Config::Rule</code></li>
     * <li><code>ACS::Config::AggregateConfigRule</code></li>
     * <li><code>ACS::Config::Aggregator</code></li>
     * <li><code>ACS::Config::CompliancePack</code></li>
     * <li><code>ACS::Config::AggregateCompliancePack</code></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::Config:rule</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags to a resource.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    public static ListTagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesShrinkRequest self = new ListTagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagResourcesShrinkRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public ListTagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
