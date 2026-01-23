// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStandardResponseBody body;

    public static CreateStandardResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardResponse self = new CreateStandardResponse();
        return TeaModel.build(map, self);
    }

    public CreateStandardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStandardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStandardResponse setBody(CreateStandardResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStandardResponseBody getBody() {
        return this.body;
    }

}
