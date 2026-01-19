// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class CreateChatMediaUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChatMediaUrlResponseBody body;

    public static CreateChatMediaUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChatMediaUrlResponse self = new CreateChatMediaUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateChatMediaUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChatMediaUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChatMediaUrlResponse setBody(CreateChatMediaUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatMediaUrlResponseBody getBody() {
        return this.body;
    }

}
