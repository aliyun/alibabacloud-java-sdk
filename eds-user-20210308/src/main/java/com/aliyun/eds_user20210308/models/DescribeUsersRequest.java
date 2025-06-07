// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUsersRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The usernames that must be exactly matched.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The usernames that must be exactly excluded.</p>
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
    public java.util.Map<String, String> filterWithAssignedResource;

    @NameInMap("FilterWithAssignedResources")
    public java.util.Map<String, Boolean> filterWithAssignedResources;

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
     * <p>The maximum number of entries per page.</p>
     * <ul>
     * <li>Valid values: 1 to 500.</li>
     * <li>Default value: 500.</li>
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
    public java.util.Map<String, ?> showExtras;

    @NameInMap("SolutionId")
    public String solutionId;

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

    public DescribeUsersRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
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
