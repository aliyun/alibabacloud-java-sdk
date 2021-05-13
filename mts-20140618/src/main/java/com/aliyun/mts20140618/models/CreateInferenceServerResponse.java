// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateInferenceServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInferenceServerResponseBody body;

    public static CreateInferenceServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInferenceServerResponse self = new CreateInferenceServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateInferenceServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInferenceServerResponse setBody(CreateInferenceServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInferenceServerResponseBody getBody() {
        return this.body;
    }

}
