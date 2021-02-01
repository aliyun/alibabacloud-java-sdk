// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeLogoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeLogoResponseBody body;

    public static RecognizeLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLogoResponse self = new RecognizeLogoResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeLogoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeLogoResponse setBody(RecognizeLogoResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeLogoResponseBody getBody() {
        return this.body;
    }

}
