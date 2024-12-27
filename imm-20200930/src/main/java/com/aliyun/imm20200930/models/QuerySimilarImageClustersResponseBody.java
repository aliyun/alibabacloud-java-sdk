// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QuerySimilarImageClustersResponseBody extends TeaModel {
    /**
     * <p>The pagination token. If the total number of clusters is greater than the value of MaxResults, this token can be used to retrieve the next page. This parameter has a value only if not all the clusters that meet the condition are returned.</p>
     * <p>Pass this value as the value of NextToken in the next query to return the subsequent clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KClVwZGF0ZVRpbWUQARgBIs8ECgkAAJLUwUCAQ****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CA995EFD-083D-4F40-BE8A-BDF75FFF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of similar image clusters.</p>
     */
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
