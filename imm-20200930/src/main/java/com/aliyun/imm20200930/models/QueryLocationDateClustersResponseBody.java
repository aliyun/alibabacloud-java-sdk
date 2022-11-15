// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryLocationDateClustersResponseBody extends TeaModel {
    @NameInMap("LocationDateClusters")
    public java.util.List<LocationDateCluster> locationDateClusters;

    @NameInMap("NextToken")
    public String nextToken;

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
