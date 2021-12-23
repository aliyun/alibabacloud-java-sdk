// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListFigureClustersResponseBody extends TeaModel {
    @NameInMap("FigureClusters")
    public java.util.List<FigureCluster> figureClusters;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListFigureClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFigureClustersResponseBody self = new ListFigureClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFigureClustersResponseBody setFigureClusters(java.util.List<FigureCluster> figureClusters) {
        this.figureClusters = figureClusters;
        return this;
    }
    public java.util.List<FigureCluster> getFigureClusters() {
        return this.figureClusters;
    }

    public ListFigureClustersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFigureClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
