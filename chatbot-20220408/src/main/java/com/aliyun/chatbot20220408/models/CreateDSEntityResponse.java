// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDSEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDSEntityResponseBody body;

    public static CreateDSEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDSEntityResponse self = new CreateDSEntityResponse();
        return TeaModel.build(map, self);
    }

    public CreateDSEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDSEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDSEntityResponse setBody(CreateDSEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDSEntityResponseBody getBody() {
        return this.body;
    }

}
