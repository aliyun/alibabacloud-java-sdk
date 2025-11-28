// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateBroadcastVideoFromTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBroadcastVideoFromTemplateResponseBody body;

    public static CreateBroadcastVideoFromTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBroadcastVideoFromTemplateResponse self = new CreateBroadcastVideoFromTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateBroadcastVideoFromTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBroadcastVideoFromTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBroadcastVideoFromTemplateResponse setBody(CreateBroadcastVideoFromTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBroadcastVideoFromTemplateResponseBody getBody() {
        return this.body;
    }

}
