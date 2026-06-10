// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListDirectoryUsersRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is not publicly available. You can only set this parameter to <code>1</code> or leave it empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AssignedInfo")
    public String assignedInfo;

    /**
     * <p>The AD directory ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-jedbpr4sl9l37****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The string for a fuzzy search. The operation returns all results that contain this string.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Specifies whether to return only users who are assigned cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeAssignedUser")
    public Boolean includeAssignedUser;

    /**
     * <p>The number of entries to return on each page.</p>
     * <ul>
     * <li><p>Maximum value: 100.</p>
     * </li>
     * <li><p>Default value: 10.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query. If this value is empty, no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The path of the organizational unit (OU) in the AD domain. You can call <a href="https://help.aliyun.com/document_detail/311259.html">ListUserAdOrganizationUnits</a> to obtain the OU path.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/Domain Controllers</p>
     */
    @NameInMap("OUPath")
    public String OUPath;

    /**
     * <p>The region ID. To get a list of regions that WUYING Workspace supports, call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a>.</p>
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

    public static ListDirectoryUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoryUsersRequest self = new ListDirectoryUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListDirectoryUsersRequest setAssignedInfo(String assignedInfo) {
        this.assignedInfo = assignedInfo;
        return this;
    }
    public String getAssignedInfo() {
        return this.assignedInfo;
    }

    public ListDirectoryUsersRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListDirectoryUsersRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListDirectoryUsersRequest setIncludeAssignedUser(Boolean includeAssignedUser) {
        this.includeAssignedUser = includeAssignedUser;
        return this;
    }
    public Boolean getIncludeAssignedUser() {
        return this.includeAssignedUser;
    }

    public ListDirectoryUsersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDirectoryUsersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDirectoryUsersRequest setOUPath(String OUPath) {
        this.OUPath = OUPath;
        return this;
    }
    public String getOUPath() {
        return this.OUPath;
    }

    public ListDirectoryUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDirectoryUsersRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

}
