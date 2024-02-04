// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTriggerResponseBody body;

    public static GetTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTriggerResponse self = new GetTriggerResponse();
        return TeaModel.build(map, self);
    }

    public GetTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTriggerResponse setBody(GetTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTriggerResponseBody getBody() {
        return this.body;
    }

}
