// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRepairScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRepairScriptResponseBody body;

    public static GetRepairScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepairScriptResponse self = new GetRepairScriptResponse();
        return TeaModel.build(map, self);
    }

    public GetRepairScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepairScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepairScriptResponse setBody(GetRepairScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepairScriptResponseBody getBody() {
        return this.body;
    }

}
