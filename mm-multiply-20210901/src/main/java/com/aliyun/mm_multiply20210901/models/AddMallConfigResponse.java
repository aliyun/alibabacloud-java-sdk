// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class AddMallConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddMallConfigResponseBody body;

    public static AddMallConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMallConfigResponse self = new AddMallConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddMallConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMallConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMallConfigResponse setBody(AddMallConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMallConfigResponseBody getBody() {
        return this.body;
    }

}
