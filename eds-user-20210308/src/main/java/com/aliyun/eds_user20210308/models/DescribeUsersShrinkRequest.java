// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUsersShrinkRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The list of usernames that must be exactly matched.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The list of usernames to be exactly excluded.</p>
     */
    @NameInMap("ExcludeEndUserIds")
    public java.util.List<String> excludeEndUserIds;

    /**
     * <p>The string that is used for fuzzy search. You perform fuzzy search by username (EndUserId) and email address (Email). Wildcard characters (\*) are supported. For example, if you set this parameter to <code>a*m</code>, usernames or email addresses that start with <code>a</code> and end with <code>m</code> are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>a*m</p>
     */
    @NameInMap("Filter")
    public String filter;

    @NameInMap("FilterWithAssignedResource")
    public String filterWithAssignedResourceShrink;

    @NameInMap("FilterWithAssignedResources")
    public String filterWithAssignedResourcesShrink;

    /**
     * <p>The ID of the organization in which you want to query convenience users.</p>
     * 
     * <strong>example:</strong>
     * <p>ug-12341234****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IsQueryAllSubOrgs")
    public Boolean isQueryAllSubOrgs;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Valid values: 1 to 500</li>
     * <li>Default value: 500</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.\
     * If not all results are returned in a query, a value is returned for the NextToken parameter. In this case, you can use the return value of NextToken to perform the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the organization in which you want to query users.</p>
     * 
     * <strong>example:</strong>
     * <p>org-4mdgc1cocc59z****</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ShowExtras")
    public String showExtrasShrink;

    @NameInMap("SolutionId")
    public String solutionId;

    public static DescribeUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersShrinkRequest self = new DescribeUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsersShrinkRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeUsersShrinkRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public DescribeUsersShrinkRequest setExcludeEndUserIds(java.util.List<String> excludeEndUserIds) {
        this.excludeEndUserIds = excludeEndUserIds;
        return this;
    }
    public java.util.List<String> getExcludeEndUserIds() {
        return this.excludeEndUserIds;
    }

    public DescribeUsersShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeUsersShrinkRequest setFilterWithAssignedResourceShrink(String filterWithAssignedResourceShrink) {
        this.filterWithAssignedResourceShrink = filterWithAssignedResourceShrink;
        return this;
    }
    public String getFilterWithAssignedResourceShrink() {
        return this.filterWithAssignedResourceShrink;
    }

    public DescribeUsersShrinkRequest setFilterWithAssignedResourcesShrink(String filterWithAssignedResourcesShrink) {
        this.filterWithAssignedResourcesShrink = filterWithAssignedResourcesShrink;
        return this;
    }
    public String getFilterWithAssignedResourcesShrink() {
        return this.filterWithAssignedResourcesShrink;
    }

    public DescribeUsersShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeUsersShrinkRequest setIsQueryAllSubOrgs(Boolean isQueryAllSubOrgs) {
        this.isQueryAllSubOrgs = isQueryAllSubOrgs;
        return this;
    }
    public Boolean getIsQueryAllSubOrgs() {
        return this.isQueryAllSubOrgs;
    }

    public DescribeUsersShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeUsersShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUsersShrinkRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DescribeUsersShrinkRequest setShowExtrasShrink(String showExtrasShrink) {
        this.showExtrasShrink = showExtrasShrink;
        return this;
    }
    public String getShowExtrasShrink() {
        return this.showExtrasShrink;
    }

    public DescribeUsersShrinkRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

}
