// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeRulesShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page for a paged query. Maximum value: 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether a next query token exists. Valid values: If NextToken is empty, no more results exist. If NextToken is returned, the value indicates the token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>cae**********699</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-000***123</p>
     */
    @NameInMap("ResourceCategoryId")
    public String resourceCategoryId;

    @NameInMap("ResourceOwnerIds")
    public String resourceOwnerIdsShrink;

    /**
     * <p>The region ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulesShrinkRequest self = new DescribeRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRulesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeRulesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRulesShrinkRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    public DescribeRulesShrinkRequest setResourceOwnerIdsShrink(String resourceOwnerIdsShrink) {
        this.resourceOwnerIdsShrink = resourceOwnerIdsShrink;
        return this;
    }
    public String getResourceOwnerIdsShrink() {
        return this.resourceOwnerIdsShrink;
    }

    public DescribeRulesShrinkRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public DescribeRulesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
