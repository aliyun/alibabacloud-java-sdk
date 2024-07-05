// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryFigureClustersResponseBody extends TeaModel {
    @NameInMap("FigureClusters")
    public java.util.List<FigureCluster> figureClusters;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>CA995EFD-083D-4F40-BE8A-BDF75FFF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryFigureClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFigureClustersResponseBody self = new QueryFigureClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFigureClustersResponseBody setFigureClusters(java.util.List<FigureCluster> figureClusters) {
        this.figureClusters = figureClusters;
        return this;
    }
    public java.util.List<FigureCluster> getFigureClusters() {
        return this.figureClusters;
    }

    public QueryFigureClustersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryFigureClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFigureClustersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
