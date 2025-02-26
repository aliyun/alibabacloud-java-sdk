// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class EndCoordinationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5C5CEF0A-D6E1-58D3-8750-67DB4F82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EndCoordinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EndCoordinationResponseBody self = new EndCoordinationResponseBody();
        return TeaModel.build(map, self);
    }

    public EndCoordinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
