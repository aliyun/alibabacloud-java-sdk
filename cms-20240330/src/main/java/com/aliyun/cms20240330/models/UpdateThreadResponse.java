// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateThreadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateThreadResponseBody body;

    public static UpdateThreadResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateThreadResponse self = new UpdateThreadResponse();
        return TeaModel.build(map, self);
    }

    public UpdateThreadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateThreadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateThreadResponse setBody(UpdateThreadResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateThreadResponseBody getBody() {
        return this.body;
    }

}
