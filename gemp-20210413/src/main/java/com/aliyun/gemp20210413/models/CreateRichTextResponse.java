// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateRichTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRichTextResponseBody body;

    public static CreateRichTextResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRichTextResponse self = new CreateRichTextResponse();
        return TeaModel.build(map, self);
    }

    public CreateRichTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRichTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRichTextResponse setBody(CreateRichTextResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRichTextResponseBody getBody() {
        return this.body;
    }

}
