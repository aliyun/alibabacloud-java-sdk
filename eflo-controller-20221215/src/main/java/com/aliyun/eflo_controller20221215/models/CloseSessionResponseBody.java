// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CloseSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>07AA3A1F-321E-50D8-B834-88C411331C94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>i206495551737511455528</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>ClosingActive</p>
     * 
     * <strong>example:</strong>
     * <p>Inactive</p>
     */
    @NameInMap("State")
    public String state;

    public static CloseSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseSessionResponseBody self = new CloseSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloseSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CloseSessionResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
