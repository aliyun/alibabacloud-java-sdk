// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateBotSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBotSpecResponseBody body;

    public static UpdateBotSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBotSpecResponse self = new UpdateBotSpecResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBotSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBotSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBotSpecResponse setBody(UpdateBotSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBotSpecResponseBody getBody() {
        return this.body;
    }

}
