// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The data redundancy type.</p>
     * 
     * <strong>example:</strong>
     * <p>LRS</p>
     */
    @NameInMap("DataRedundancyType")
    public String dataRedundancyType;

    /**
     * <p>A filter for rules that failed the scoring.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-000c***yc9</p>
     */
    @NameInMap("FailedRuleTemplate")
    public String failedRuleTemplate;

    /**
     * <p>The page size. Default: 10. Maximum: 100. Values less than 10 are set to 10, and values greater than 100 are set to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. The service returns a token if the response is truncated. To retrieve the next page of results, include this token in your next request. If no token is returned, all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>cae**********699</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The Resource ARN.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ecs:cn-hangzhou:123<em><strong>7890:instance/i-123</strong></em>7890</p>
     */
    @NameInMap("ResourceArn")
    public String resourceArn;

    /**
     * <p>The ID of the resource category.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-000***123</p>
     */
    @NameInMap("ResourceCategoryId")
    public String resourceCategoryId;

    /**
     * <p>The resource ID. For example, for an instance, this is the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-0003***110</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>A list of resource owner IDs. Use this parameter for cross-account scenarios. If you omit this parameter, the service returns data for the current account by default.</p>
     * 
     * <strong>example:</strong>
     * <p>[123***7890]</p>
     */
    @NameInMap("ResourceOwnerIds")
    public String resourceOwnerIdsShrink;

    /**
     * <p>The resource region ID.</p>
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

    /**
     * <p>The sort key.</p>
     * 
     * <strong>example:</strong>
     * <p>protectionScore</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The storage class.</p>
     * 
     * <strong>example:</strong>
     * <p>ARCHIVE</p>
     */
    @NameInMap("StorageClass")
    public String storageClass;

    public static DescribeResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesShrinkRequest self = new DescribeResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesShrinkRequest setDataRedundancyType(String dataRedundancyType) {
        this.dataRedundancyType = dataRedundancyType;
        return this;
    }
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    public DescribeResourcesShrinkRequest setFailedRuleTemplate(String failedRuleTemplate) {
        this.failedRuleTemplate = failedRuleTemplate;
        return this;
    }
    public String getFailedRuleTemplate() {
        return this.failedRuleTemplate;
    }

    public DescribeResourcesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeResourcesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeResourcesShrinkRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public DescribeResourcesShrinkRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    public DescribeResourcesShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeResourcesShrinkRequest setResourceOwnerIdsShrink(String resourceOwnerIdsShrink) {
        this.resourceOwnerIdsShrink = resourceOwnerIdsShrink;
        return this;
    }
    public String getResourceOwnerIdsShrink() {
        return this.resourceOwnerIdsShrink;
    }

    public DescribeResourcesShrinkRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public DescribeResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeResourcesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeResourcesShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public DescribeResourcesShrinkRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
