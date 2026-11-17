// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetLogicalModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogicalModelResponseBody body;

    public static GetLogicalModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogicalModelResponse self = new GetLogicalModelResponse();
        return TeaModel.build(map, self);
    }

    public GetLogicalModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogicalModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogicalModelResponse setBody(GetLogicalModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogicalModelResponseBody getBody() {
        return this.body;
    }

}
