// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetCopilotTurnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCopilotTurnResponseBody body;

    public static GetCopilotTurnResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCopilotTurnResponse self = new GetCopilotTurnResponse();
        return TeaModel.build(map, self);
    }

    public GetCopilotTurnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCopilotTurnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCopilotTurnResponse setBody(GetCopilotTurnResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCopilotTurnResponseBody getBody() {
        return this.body;
    }

}
