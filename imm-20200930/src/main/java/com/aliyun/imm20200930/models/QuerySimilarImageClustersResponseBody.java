// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QuerySimilarImageClustersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SimilarImageClusters")
    public java.util.List<SimilarImageCluster> similarImageClusters;

    public static QuerySimilarImageClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySimilarImageClustersResponseBody self = new QuerySimilarImageClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySimilarImageClustersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QuerySimilarImageClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySimilarImageClustersResponseBody setSimilarImageClusters(java.util.List<SimilarImageCluster> similarImageClusters) {
        this.similarImageClusters = similarImageClusters;
        return this;
    }
    public java.util.List<SimilarImageCluster> getSimilarImageClusters() {
        return this.similarImageClusters;
    }

}
