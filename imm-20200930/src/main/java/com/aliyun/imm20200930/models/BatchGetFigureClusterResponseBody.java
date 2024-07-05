// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchGetFigureClusterResponseBody extends TeaModel {
    @NameInMap("FigureClusters")
    public java.util.List<FigureCluster> figureClusters;

    /**
     * <strong>example:</strong>
     * <p>CA995EFD-083D-4F40-BE8A-BDF75FFF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchGetFigureClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFigureClusterResponseBody self = new BatchGetFigureClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetFigureClusterResponseBody setFigureClusters(java.util.List<FigureCluster> figureClusters) {
        this.figureClusters = figureClusters;
        return this;
    }
    public java.util.List<FigureCluster> getFigureClusters() {
        return this.figureClusters;
    }

    public BatchGetFigureClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
