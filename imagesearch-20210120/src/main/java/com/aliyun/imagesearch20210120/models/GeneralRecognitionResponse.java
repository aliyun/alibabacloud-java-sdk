// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class GeneralRecognitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GeneralRecognitionResponseBody body;

    public static GeneralRecognitionResponse build(java.util.Map<String, ?> map) throws Exception {
        GeneralRecognitionResponse self = new GeneralRecognitionResponse();
        return TeaModel.build(map, self);
    }

    public GeneralRecognitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GeneralRecognitionResponse setBody(GeneralRecognitionResponseBody body) {
        this.body = body;
        return this;
    }
    public GeneralRecognitionResponseBody getBody() {
        return this.body;
    }

}
