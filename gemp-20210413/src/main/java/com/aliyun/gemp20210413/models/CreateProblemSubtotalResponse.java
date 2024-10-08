// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemSubtotalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProblemSubtotalResponseBody body;

    public static CreateProblemSubtotalResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemSubtotalResponse self = new CreateProblemSubtotalResponse();
        return TeaModel.build(map, self);
    }

    public CreateProblemSubtotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProblemSubtotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProblemSubtotalResponse setBody(CreateProblemSubtotalResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProblemSubtotalResponseBody getBody() {
        return this.body;
    }

}
