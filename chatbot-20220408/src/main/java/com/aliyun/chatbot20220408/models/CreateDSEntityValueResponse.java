// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateDSEntityValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDSEntityValueResponseBody body;

    public static CreateDSEntityValueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDSEntityValueResponse self = new CreateDSEntityValueResponse();
        return TeaModel.build(map, self);
    }

    public CreateDSEntityValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDSEntityValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDSEntityValueResponse setBody(CreateDSEntityValueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDSEntityValueResponseBody getBody() {
        return this.body;
    }

}
