// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateUdfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUdfResponseBody body;

    public static CreateUdfResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUdfResponse self = new CreateUdfResponse();
        return TeaModel.build(map, self);
    }

    public CreateUdfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUdfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUdfResponse setBody(CreateUdfResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUdfResponseBody getBody() {
        return this.body;
    }

}
