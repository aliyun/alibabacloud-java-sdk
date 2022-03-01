// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class HighlightGameVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HighlightGameVideoResponseBody body;

    public static HighlightGameVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        HighlightGameVideoResponse self = new HighlightGameVideoResponse();
        return TeaModel.build(map, self);
    }

    public HighlightGameVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HighlightGameVideoResponse setBody(HighlightGameVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public HighlightGameVideoResponseBody getBody() {
        return this.body;
    }

}
