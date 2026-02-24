// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListTagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The token to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJ****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region to which the tags belong.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource ID.</p>
     * <p>You can query tags for a maximum of 50 resources.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type in CloudConfig. Valid values:</p>
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
     * <p>You can filter resources by a maximum of 20 tags.</p>
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
