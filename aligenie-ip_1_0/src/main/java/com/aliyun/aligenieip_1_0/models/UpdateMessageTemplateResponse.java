// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateMessageTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMessageTemplateResponseBody body;

    public static UpdateMessageTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageTemplateResponse self = new UpdateMessageTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMessageTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMessageTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMessageTemplateResponse setBody(UpdateMessageTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMessageTemplateResponseBody getBody() {
        return this.body;
    }

}
