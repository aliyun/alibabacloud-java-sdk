// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineAccessTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EB775B32-1148-1963-9ADD-74CC90C16459</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb3V0aW5lX2lkIjoidHktbWV0YXEtdGVzdC4xNzEzMTU1ODk3ODg1Njg2IiwiZXhwIjoxNzY0OTQ0NTU3fQ.g3gFr-6GQR8vcg6b_vy1qBZ1LDYOiDP-Sih0wtu3d64</p>
     */
    @NameInMap("Token")
    public String token;

    public static GetRoutineAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineAccessTokenResponseBody self = new GetRoutineAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutineAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoutineAccessTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
