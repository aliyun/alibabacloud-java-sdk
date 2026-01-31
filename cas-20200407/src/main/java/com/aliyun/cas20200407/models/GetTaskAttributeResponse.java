// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetTaskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskAttributeResponseBody body;

    public static GetTaskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskAttributeResponse self = new GetTaskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskAttributeResponse setBody(GetTaskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskAttributeResponseBody getBody() {
        return this.body;
    }

}
