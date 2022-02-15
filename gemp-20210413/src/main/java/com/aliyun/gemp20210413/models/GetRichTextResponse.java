// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetRichTextResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRichTextResponseBody body;

    public static GetRichTextResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRichTextResponse self = new GetRichTextResponse();
        return TeaModel.build(map, self);
    }

    public GetRichTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRichTextResponse setBody(GetRichTextResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRichTextResponseBody getBody() {
        return this.body;
    }

}
