// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetListenerAttributeResponseBody body;

    public static GetListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetListenerAttributeResponse self = new GetListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetListenerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetListenerAttributeResponse setBody(GetListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
