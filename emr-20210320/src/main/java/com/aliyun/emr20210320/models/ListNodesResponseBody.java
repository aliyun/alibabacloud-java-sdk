// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The position at which the next read starts. If null is returned, the data has been read.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Details about nodes.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<Node> nodes;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records in this request.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodesResponseBody setNodes(java.util.List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<Node> getNodes() {
        return this.nodes;
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
