// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUsersRequest extends TeaModel {
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
    public java.util.Map<String, String> filterMap;

    /**
     * <p>Filters users by whether a cloud resource is assigned.</p>
     */
    @NameInMap("FilterWithAssignedResource")
    public java.util.Map<String, String> filterWithAssignedResource;

    /**
     * <blockquote>
     * <p>This parameter is not available to the public.</p>
     * </blockquote>
     */
    @NameInMap("FilterWithAssignedResources")
    public java.util.Map<String, Boolean> filterWithAssignedResources;

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
    public java.util.Map<String, ?> showExtras;

    @NameInMap("SolutionId")
    public String solutionId;

    /**
     * <p>Specifies whether to query users in suborganizations.</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersRequest self = new DescribeUsersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsersRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeUsersRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public DescribeUsersRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public DescribeUsersRequest setExcludeEndUserIds(java.util.List<String> excludeEndUserIds) {
        this.excludeEndUserIds = excludeEndUserIds;
        return this;
    }
    public java.util.List<String> getExcludeEndUserIds() {
        return this.excludeEndUserIds;
    }

    public DescribeUsersRequest setExcludeGroupId(String excludeGroupId) {
        this.excludeGroupId = excludeGroupId;
        return this;
    }
    public String getExcludeGroupId() {
        return this.excludeGroupId;
    }

    public DescribeUsersRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeUsersRequest setFilterMap(java.util.Map<String, String> filterMap) {
        this.filterMap = filterMap;
        return this;
    }
    public java.util.Map<String, String> getFilterMap() {
        return this.filterMap;
    }

    public DescribeUsersRequest setFilterWithAssignedResource(java.util.Map<String, String> filterWithAssignedResource) {
        this.filterWithAssignedResource = filterWithAssignedResource;
        return this;
    }
    public java.util.Map<String, String> getFilterWithAssignedResource() {
        return this.filterWithAssignedResource;
    }

    public DescribeUsersRequest setFilterWithAssignedResources(java.util.Map<String, Boolean> filterWithAssignedResources) {
        this.filterWithAssignedResources = filterWithAssignedResources;
        return this;
    }
    public java.util.Map<String, Boolean> getFilterWithAssignedResources() {
        return this.filterWithAssignedResources;
    }

    public DescribeUsersRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeUsersRequest setIsQueryAllSubOrgs(Boolean isQueryAllSubOrgs) {
        this.isQueryAllSubOrgs = isQueryAllSubOrgs;
        return this;
    }
    public Boolean getIsQueryAllSubOrgs() {
        return this.isQueryAllSubOrgs;
    }

    public DescribeUsersRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeUsersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUsersRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DescribeUsersRequest setShowExtras(java.util.Map<String, ?> showExtras) {
        this.showExtras = showExtras;
        return this;
    }
    public java.util.Map<String, ?> getShowExtras() {
        return this.showExtras;
    }

    public DescribeUsersRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public DescribeUsersRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
