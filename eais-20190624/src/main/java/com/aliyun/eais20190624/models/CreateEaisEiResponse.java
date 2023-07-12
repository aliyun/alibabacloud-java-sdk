// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaisEiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEaisEiResponseBody body;

    public static CreateEaisEiResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEaisEiResponse self = new CreateEaisEiResponse();
        return TeaModel.build(map, self);
    }

    public CreateEaisEiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEaisEiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEaisEiResponse setBody(CreateEaisEiResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEaisEiResponseBody getBody() {
        return this.body;
    }

}
