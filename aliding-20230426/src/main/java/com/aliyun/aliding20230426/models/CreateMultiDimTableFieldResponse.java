// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMultiDimTableFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMultiDimTableFieldResponseBody body;

    public static CreateMultiDimTableFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiDimTableFieldResponse self = new CreateMultiDimTableFieldResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultiDimTableFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultiDimTableFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultiDimTableFieldResponse setBody(CreateMultiDimTableFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultiDimTableFieldResponseBody getBody() {
        return this.body;
    }

}
