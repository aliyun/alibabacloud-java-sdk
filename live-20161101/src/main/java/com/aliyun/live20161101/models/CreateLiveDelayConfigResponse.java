// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveDelayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLiveDelayConfigResponseBody body;

    public static CreateLiveDelayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveDelayConfigResponse self = new CreateLiveDelayConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveDelayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveDelayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLiveDelayConfigResponse setBody(CreateLiveDelayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveDelayConfigResponseBody getBody() {
        return this.body;
    }

}
