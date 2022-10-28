// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFigureClusterResponseBody extends TeaModel {
    @NameInMap("FigureCluster")
    public FigureCluster figureCluster;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFigureClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFigureClusterResponseBody self = new UpdateFigureClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFigureClusterResponseBody setFigureCluster(FigureCluster figureCluster) {
        this.figureCluster = figureCluster;
        return this;
    }
    public FigureCluster getFigureCluster() {
        return this.figureCluster;
    }

    public UpdateFigureClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
