// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteUsersRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This field is not available for use. You can only set this parameter to <code>1</code> or leave it empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AssignedInfo")
    public String assignedInfo;

    /**
     * <p>The fuzzy query string.</p>
     * 
     * <strong>example:</strong>
     * <p><em>jin</em></p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Specifies whether to return only the users to which cloud desktops are assigned.</p>
     */
    @NameInMap("IncludeAssignedUser")
    public Boolean includeAssignedUser;

    /**
     * <p>The number of entries per page for a paged query.    </p>
     * <ul>
     * <li>Maximum value: 100.    </li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Leave this parameter empty for the first query or when no subsequent query is required. For subsequent queries, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The specified organizational unit (OU) of the AD domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/Domain Controllers</p>
     */
    @NameInMap("OUPath")
    public String OUPath;

    /**
     * <p>The office network ID. Only office networks based on enterprise AD accounts are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The sorting method.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortType")
    public String sortType;

    public static ListOfficeSiteUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteUsersRequest self = new ListOfficeSiteUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteUsersRequest setAssignedInfo(String assignedInfo) {
        this.assignedInfo = assignedInfo;
        return this;
    }
    public String getAssignedInfo() {
        return this.assignedInfo;
    }

    public ListOfficeSiteUsersRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListOfficeSiteUsersRequest setIncludeAssignedUser(Boolean includeAssignedUser) {
        this.includeAssignedUser = includeAssignedUser;
        return this;
    }
    public Boolean getIncludeAssignedUser() {
        return this.includeAssignedUser;
    }

    public ListOfficeSiteUsersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOfficeSiteUsersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOfficeSiteUsersRequest setOUPath(String OUPath) {
        this.OUPath = OUPath;
        return this;
    }
    public String getOUPath() {
        return this.OUPath;
    }

    public ListOfficeSiteUsersRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ListOfficeSiteUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOfficeSiteUsersRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

}
