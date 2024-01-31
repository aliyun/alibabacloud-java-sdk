// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyQueryResponseBody body;

    public static ApplyQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyQueryResponse self = new ApplyQueryResponse();
        return TeaModel.build(map, self);
    }

    public ApplyQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyQueryResponse setBody(ApplyQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyQueryResponseBody getBody() {
        return this.body;
    }

}
