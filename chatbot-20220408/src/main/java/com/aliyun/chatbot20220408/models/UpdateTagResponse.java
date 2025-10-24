// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTagResponseBody body;

    public static UpdateTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTagResponse self = new UpdateTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTagResponse setBody(UpdateTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTagResponseBody getBody() {
        return this.body;
    }

}
