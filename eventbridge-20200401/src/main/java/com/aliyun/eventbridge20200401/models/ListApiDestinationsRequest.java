// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListApiDestinationsRequest extends TeaModel {
    @NameInMap("ApiDestinationNamePrefix")
    public String apiDestinationNamePrefix;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

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

    public ListApiDestinationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListApiDestinationsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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
