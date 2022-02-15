// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateRichTextResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRichTextResponseBody body;

    public static UpdateRichTextResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRichTextResponse self = new UpdateRichTextResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRichTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRichTextResponse setBody(UpdateRichTextResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRichTextResponseBody getBody() {
        return this.body;
    }

}
