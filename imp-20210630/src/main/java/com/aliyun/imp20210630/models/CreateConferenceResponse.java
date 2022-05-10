// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateConferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConferenceResponseBody body;

    public static CreateConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConferenceResponse self = new CreateConferenceResponse();
        return TeaModel.build(map, self);
    }

    public CreateConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConferenceResponse setBody(CreateConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConferenceResponseBody getBody() {
        return this.body;
    }

}
