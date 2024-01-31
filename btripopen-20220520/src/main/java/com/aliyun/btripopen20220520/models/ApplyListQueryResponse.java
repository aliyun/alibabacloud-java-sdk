// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyListQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyListQueryResponseBody body;

    public static ApplyListQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyListQueryResponse self = new ApplyListQueryResponse();
        return TeaModel.build(map, self);
    }

    public ApplyListQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyListQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyListQueryResponse setBody(ApplyListQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyListQueryResponseBody getBody() {
        return this.body;
    }

}
