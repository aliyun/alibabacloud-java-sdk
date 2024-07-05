// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateFigureClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5F74C5C9-5AC0-49F9-914D-E01589D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFigureClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFigureClusterResponseBody self = new UpdateFigureClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFigureClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
