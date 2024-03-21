// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEntityResponseBody body;

    public static UpdateEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityResponse self = new UpdateEntityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEntityResponse setBody(UpdateEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEntityResponseBody getBody() {
        return this.body;
    }

}
