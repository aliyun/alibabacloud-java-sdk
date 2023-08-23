// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntRiskQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EntRiskQueryResponseBody body;

    public static EntRiskQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        EntRiskQueryResponse self = new EntRiskQueryResponse();
        return TeaModel.build(map, self);
    }

    public EntRiskQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EntRiskQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EntRiskQueryResponse setBody(EntRiskQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public EntRiskQueryResponseBody getBody() {
        return this.body;
    }

}
