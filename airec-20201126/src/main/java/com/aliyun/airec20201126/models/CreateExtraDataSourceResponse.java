// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateExtraDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExtraDataSourceResponseBody body;

    public static CreateExtraDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExtraDataSourceResponse self = new CreateExtraDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateExtraDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExtraDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExtraDataSourceResponse setBody(CreateExtraDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExtraDataSourceResponseBody getBody() {
        return this.body;
    }

}
