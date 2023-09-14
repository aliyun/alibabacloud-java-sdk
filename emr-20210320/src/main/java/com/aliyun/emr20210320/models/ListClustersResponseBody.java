// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    /**
     * <p>The list of clusters.</p>
     */
    @NameInMap("Clusters")
    public java.util.List<ClusterSummary> clusters;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The page number of the next page returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponseBody self = new ListClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersResponseBody setClusters(java.util.List<ClusterSummary> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<ClusterSummary> getClusters() {
        return this.clusters;
    }

    public ListClustersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListClustersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
