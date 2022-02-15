// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateRichTextResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateRichTextResponse setBody(CreateRichTextResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRichTextResponseBody getBody() {
        return this.body;
    }

}
