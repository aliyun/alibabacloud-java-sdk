// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateLgfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLgfResponseBody body;

    public static UpdateLgfResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLgfResponse self = new UpdateLgfResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLgfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLgfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLgfResponse setBody(UpdateLgfResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLgfResponseBody getBody() {
        return this.body;
    }

}
