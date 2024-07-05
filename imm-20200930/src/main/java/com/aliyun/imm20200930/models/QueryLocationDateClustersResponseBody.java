// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryLocationDateClustersResponseBody extends TeaModel {
    @NameInMap("LocationDateClusters")
    public java.util.List<LocationDateCluster> locationDateClusters;

    /**
     * <strong>example:</strong>
     * <p>MzQNjmY2MzYxNhNjk2ZNjEu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>7055FCF7-4D7B-098E-BD4D-DD2932B0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryLocationDateClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLocationDateClustersResponseBody self = new QueryLocationDateClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLocationDateClustersResponseBody setLocationDateClusters(java.util.List<LocationDateCluster> locationDateClusters) {
        this.locationDateClusters = locationDateClusters;
        return this;
    }
    public java.util.List<LocationDateCluster> getLocationDateClusters() {
        return this.locationDateClusters;
    }

    public QueryLocationDateClustersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryLocationDateClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
