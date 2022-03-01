// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class RecognizeImageColorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeImageColorResponseBody body;

    public static RecognizeImageColorResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageColorResponse self = new RecognizeImageColorResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeImageColorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeImageColorResponse setBody(RecognizeImageColorResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeImageColorResponseBody getBody() {
        return this.body;
    }

}
