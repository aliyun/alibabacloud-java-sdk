// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListDirectoryUsersRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This field is not available for use. You can only pass in <code>1</code> or leave it empty.</p>
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
     * <p>The fuzzy match query string. All results that contain this character string are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Specifies whether to return only users who have been assigned cloud computers.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>The pagination token for the next query. An empty value indicates that no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The organizational unit (OU) in the AD domain to which the user belongs. You can call <a href="https://help.aliyun.com/document_detail/311259.html">ListUserAdOrganizationUnits</a> to obtain this value.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/Domain Controllers</p>
     */
    @NameInMap("OUPath")
    public String OUPath;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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
