// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunauth20181222.models;

import com.aliyun.tea.*;

public class GetDetailByOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDetailByOrderResponseBody body;

    public static GetDetailByOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetailByOrderResponse self = new GetDetailByOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetDetailByOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetailByOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDetailByOrderResponse setBody(GetDetailByOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetailByOrderResponseBody getBody() {
        return this.body;
    }

}
