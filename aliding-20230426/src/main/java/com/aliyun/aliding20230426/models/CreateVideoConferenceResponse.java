// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateVideoConferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVideoConferenceResponseBody body;

    public static CreateVideoConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoConferenceResponse self = new CreateVideoConferenceResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVideoConferenceResponse setBody(CreateVideoConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoConferenceResponseBody getBody() {
        return this.body;
    }

}
