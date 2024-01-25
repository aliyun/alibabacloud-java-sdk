// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetProductInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductInstanceResponseBody body;

    public static GetProductInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductInstanceResponse self = new GetProductInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetProductInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductInstanceResponse setBody(GetProductInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductInstanceResponseBody getBody() {
        return this.body;
    }

}
