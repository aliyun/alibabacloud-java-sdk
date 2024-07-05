// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFigureClusterResponseBody extends TeaModel {
    @NameInMap("FigureCluster")
    public FigureCluster figureCluster;

    /**
     * <strong>example:</strong>
     * <p>5F74C5C9-5AC0-49F9-914D-E01589D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFigureClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFigureClusterResponseBody self = new GetFigureClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFigureClusterResponseBody setFigureCluster(FigureCluster figureCluster) {
        this.figureCluster = figureCluster;
        return this;
    }
    public FigureCluster getFigureCluster() {
        return this.figureCluster;
    }

    public GetFigureClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
