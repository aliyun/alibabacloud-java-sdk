// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddMessageTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMessageTemplateResponseBody body;

    public static AddMessageTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMessageTemplateResponse self = new AddMessageTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddMessageTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMessageTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMessageTemplateResponse setBody(AddMessageTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMessageTemplateResponseBody getBody() {
        return this.body;
    }

}
