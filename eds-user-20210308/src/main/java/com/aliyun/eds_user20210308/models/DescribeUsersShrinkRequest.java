// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUsersShrinkRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>Status</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The list of usernames (EndUserId) that you want to exactly match.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The list of usernames (EndUserId) that you want to exactly exclude.</p>
     */
    @NameInMap("ExcludeEndUserIds")
    public java.util.List<String> excludeEndUserIds;

    /**
     * <p>The ID of the user group to exclude. If specified, the query returns users who are not in this user group.</p>
     */
    @NameInMap("ExcludeGroupId")
    public String excludeGroupId;

    /**
     * <p>The filter for a fuzzy search. The filter matches usernames (EndUserId) and email addresses (Email). This parameter supports the wildcard character (\*). For example, if you set this parameter to <code>a*m</code>, all results whose usernames or email addresses start with <code>a</code> and end with <code>m</code> are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>a*m</p>
     */
    @NameInMap("Filter")
    public String filter;

    @NameInMap("FilterMap")
    public String filterMapShrink;

    /**
     * <p>Filters users by whether a cloud resource is assigned.</p>
     */
    @NameInMap("FilterWithAssignedResource")
    public String filterWithAssignedResourceShrink;

    /**
     * <blockquote>
     * <p>This parameter is not available to the public.</p>
     * </blockquote>
     */
    @NameInMap("FilterWithAssignedResources")
    public String filterWithAssignedResourcesShrink;

    /**
     * <p>Performs an exact match by user group ID to query the list of accounts that belong to the user group.</p>
     * 
     * <strong>example:</strong>
     * <p>ug-12341234****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Queries extended information about the user.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsQueryAllSubOrgs")
    public Boolean isQueryAllSubOrgs;

    /**
     * <p>The number of entries to return on each page.</p>
     * <ul>
     * <li><p>Valid values: 1 to 500.</p>
     * </li>
     * <li><p>Default value: 200.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token that is used to start the next query. If the number of entries returned exceeds the value of MaxResults, a token is returned. You can use this token in the next query to continue the query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Performs an exact match by organization ID to query the list of accounts that belong to the organization.</p>
     * 
     * <strong>example:</strong>
     * <p>org-4mdgc1cocc59z****</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <blockquote>
     * <p>This parameter is not available to the public.</p>
     * </blockquote>
     */
    @NameInMap("ShowExtras")
    public String showExtrasShrink;

    @NameInMap("SolutionId")
    public String solutionId;

    /**
     * <p>Specifies whether to query users in suborganizations.</p>
     */
    @NameInMap("Status")
    public Integer status;

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

    public DescribeUsersShrinkRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
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

    public DescribeUsersShrinkRequest setExcludeGroupId(String excludeGroupId) {
        this.excludeGroupId = excludeGroupId;
        return this;
    }
    public String getExcludeGroupId() {
        return this.excludeGroupId;
    }

    public DescribeUsersShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeUsersShrinkRequest setFilterMapShrink(String filterMapShrink) {
        this.filterMapShrink = filterMapShrink;
        return this;
    }
    public String getFilterMapShrink() {
        return this.filterMapShrink;
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

    public DescribeUsersShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
