// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerConsoleSummariesRequest extends TeaModel {
    /**
     * <p>The filter condition. Valid values: all, granted, and disabled. Default value: all.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>The target AI gateway instance ID. Consumer identities are shared across the region, while authorizations are isolated by instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-123456</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 100. This parameter is required. Token-based pagination is used instead of pageNumber and pageSize.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The keyword for fuzzy search by consumer name. This parameter does not affect the total count.</p>
     * 
     * <strong>example:</strong>
     * <p>beta</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>The pagination token returned from the previous page. Omit this parameter when querying the first page. An empty or omitted value indicates the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListConsumerConsoleSummariesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerConsoleSummariesRequest self = new ListConsumerConsoleSummariesRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumerConsoleSummariesRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListConsumerConsoleSummariesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListConsumerConsoleSummariesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConsumerConsoleSummariesRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListConsumerConsoleSummariesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
