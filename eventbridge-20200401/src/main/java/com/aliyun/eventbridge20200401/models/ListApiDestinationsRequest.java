// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListApiDestinationsRequest extends TeaModel {
    @NameInMap("ApiDestinationNamePrefix")
    public String apiDestinationNamePrefix;

    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListApiDestinationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiDestinationsRequest self = new ListApiDestinationsRequest();
        return TeaModel.build(map, self);
    }

    public ListApiDestinationsRequest setApiDestinationNamePrefix(String apiDestinationNamePrefix) {
        this.apiDestinationNamePrefix = apiDestinationNamePrefix;
        return this;
    }
    public String getApiDestinationNamePrefix() {
        return this.apiDestinationNamePrefix;
    }

    public ListApiDestinationsRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public ListApiDestinationsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListApiDestinationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
