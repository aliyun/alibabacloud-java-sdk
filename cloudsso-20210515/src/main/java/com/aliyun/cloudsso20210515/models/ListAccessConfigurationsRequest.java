// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationsRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("StatusNotifications")
    public String statusNotifications;

    public static ListAccessConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessConfigurationsRequest self = new ListAccessConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessConfigurationsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListAccessConfigurationsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListAccessConfigurationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccessConfigurationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccessConfigurationsRequest setStatusNotifications(String statusNotifications) {
        this.statusNotifications = statusNotifications;
        return this;
    }
    public String getStatusNotifications() {
        return this.statusNotifications;
    }

}
