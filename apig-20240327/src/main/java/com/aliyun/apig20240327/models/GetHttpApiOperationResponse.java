// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHttpApiOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHttpApiOperationResponseBody body;

    public static GetHttpApiOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHttpApiOperationResponse self = new GetHttpApiOperationResponse();
        return TeaModel.build(map, self);
    }

    public GetHttpApiOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHttpApiOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHttpApiOperationResponse setBody(GetHttpApiOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHttpApiOperationResponseBody getBody() {
        return this.body;
    }

}
