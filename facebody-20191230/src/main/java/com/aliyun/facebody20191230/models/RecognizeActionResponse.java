// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeActionResponseBody body;

    public static RecognizeActionResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeActionResponse self = new RecognizeActionResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeActionResponse setBody(RecognizeActionResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeActionResponseBody getBody() {
        return this.body;
    }

}
