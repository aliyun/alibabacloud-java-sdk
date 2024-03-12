// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneGlobalReplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInterveneGlobalReplyResponseBody body;

    public static GetInterveneGlobalReplyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneGlobalReplyResponse self = new GetInterveneGlobalReplyResponse();
        return TeaModel.build(map, self);
    }

    public GetInterveneGlobalReplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInterveneGlobalReplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInterveneGlobalReplyResponse setBody(GetInterveneGlobalReplyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInterveneGlobalReplyResponseBody getBody() {
        return this.body;
    }

}
