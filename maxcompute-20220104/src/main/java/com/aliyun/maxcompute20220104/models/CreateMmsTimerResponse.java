// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsTimerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMmsTimerResponseBody body;

    public static CreateMmsTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsTimerResponse self = new CreateMmsTimerResponse();
        return TeaModel.build(map, self);
    }

    public CreateMmsTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMmsTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMmsTimerResponse setBody(CreateMmsTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMmsTimerResponseBody getBody() {
        return this.body;
    }

}
