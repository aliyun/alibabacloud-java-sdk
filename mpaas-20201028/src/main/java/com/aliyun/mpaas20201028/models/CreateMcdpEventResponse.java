// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcdpEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcdpEventResponseBody body;

    public static CreateMcdpEventResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcdpEventResponse self = new CreateMcdpEventResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcdpEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcdpEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcdpEventResponse setBody(CreateMcdpEventResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcdpEventResponseBody getBody() {
        return this.body;
    }

}
