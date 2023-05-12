// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListDirectoryUsersRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OUPath")
    public String OUPath;

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
