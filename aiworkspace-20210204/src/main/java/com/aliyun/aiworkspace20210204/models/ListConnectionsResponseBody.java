// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListConnectionsResponseBody extends TeaModel {
    /**
     * <p>List of connections.</p>
     */
    @NameInMap("Connections")
    public java.util.List<Connection> connections;

    /**
     * <p>Maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for retrieving the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request ID. Used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>B2C51F93-1C07-5477-9705-5FDB****F19F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of connections that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionsResponseBody self = new ListConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectionsResponseBody setConnections(java.util.List<Connection> connections) {
        this.connections = connections;
        return this;
    }
    public java.util.List<Connection> getConnections() {
        return this.connections;
    }

    public ListConnectionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
