// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotQueryStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KopilotQueryStatusResponseBody body;

    public static KopilotQueryStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        KopilotQueryStatusResponse self = new KopilotQueryStatusResponse();
        return TeaModel.build(map, self);
    }

    public KopilotQueryStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KopilotQueryStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KopilotQueryStatusResponse setBody(KopilotQueryStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public KopilotQueryStatusResponseBody getBody() {
        return this.body;
    }

}
