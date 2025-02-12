// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrePayInstanceResponseBody body;

    public static CreatePrePayInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrePayInstanceResponse self = new CreatePrePayInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrePayInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrePayInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrePayInstanceResponse setBody(CreatePrePayInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrePayInstanceResponseBody getBody() {
        return this.body;
    }

}
