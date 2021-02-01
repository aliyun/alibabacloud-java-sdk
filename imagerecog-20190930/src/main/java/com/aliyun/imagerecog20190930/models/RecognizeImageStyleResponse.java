// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeImageStyleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeImageStyleResponseBody body;

    public static RecognizeImageStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageStyleResponse self = new RecognizeImageStyleResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeImageStyleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeImageStyleResponse setBody(RecognizeImageStyleResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeImageStyleResponseBody getBody() {
        return this.body;
    }

}
