// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMmsDataSourceResponseBody body;

    public static CreateMmsDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsDataSourceResponse self = new CreateMmsDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateMmsDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMmsDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMmsDataSourceResponse setBody(CreateMmsDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMmsDataSourceResponseBody getBody() {
        return this.body;
    }

}
