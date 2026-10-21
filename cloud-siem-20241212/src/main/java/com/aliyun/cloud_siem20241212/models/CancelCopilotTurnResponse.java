// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CancelCopilotTurnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelCopilotTurnResponseBody body;

    public static CancelCopilotTurnResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCopilotTurnResponse self = new CancelCopilotTurnResponse();
        return TeaModel.build(map, self);
    }

    public CancelCopilotTurnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCopilotTurnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelCopilotTurnResponse setBody(CancelCopilotTurnResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCopilotTurnResponseBody getBody() {
        return this.body;
    }

}
