// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateSLBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSLBResponseBody body;

    public static CreateSLBResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSLBResponse self = new CreateSLBResponse();
        return TeaModel.build(map, self);
    }

    public CreateSLBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSLBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSLBResponse setBody(CreateSLBResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSLBResponseBody getBody() {
        return this.body;
    }

}
