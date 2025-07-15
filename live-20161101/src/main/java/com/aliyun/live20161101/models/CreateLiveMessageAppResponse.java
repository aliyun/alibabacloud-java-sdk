// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveMessageAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLiveMessageAppResponseBody body;

    public static CreateLiveMessageAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveMessageAppResponse self = new CreateLiveMessageAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveMessageAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveMessageAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLiveMessageAppResponse setBody(CreateLiveMessageAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveMessageAppResponseBody getBody() {
        return this.body;
    }

}
