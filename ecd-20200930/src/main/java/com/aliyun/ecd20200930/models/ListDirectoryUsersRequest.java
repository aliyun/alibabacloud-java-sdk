// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListDirectoryUsersRequest extends TeaModel {
    /**
     * <p>The ID of the AD directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The query string for fuzzy match. If you specify this parameter, the system returns all results that contain the string.</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query. If the value of this parameter is empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The organizational unit (OU) in the specified AD domain.</p>
     */
    @NameInMap("OUPath")
    public String OUPath;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListDirectoryUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoryUsersRequest self = new ListDirectoryUsersRequest();
        return TeaModel.build(map, self);
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

}
