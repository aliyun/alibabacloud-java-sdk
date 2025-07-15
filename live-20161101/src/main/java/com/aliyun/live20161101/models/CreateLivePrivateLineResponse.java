// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLivePrivateLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLivePrivateLineResponseBody body;

    public static CreateLivePrivateLineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePrivateLineResponse self = new CreateLivePrivateLineResponse();
        return TeaModel.build(map, self);
    }

    public CreateLivePrivateLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLivePrivateLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLivePrivateLineResponse setBody(CreateLivePrivateLineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLivePrivateLineResponseBody getBody() {
        return this.body;
    }

}
