// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aquila20200104.models;

import com.aliyun.tea.*;

public class DoInferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DoInferenceResponseBody body;

    public static DoInferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        DoInferenceResponse self = new DoInferenceResponse();
        return TeaModel.build(map, self);
    }

    public DoInferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoInferenceResponse setBody(DoInferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public DoInferenceResponseBody getBody() {
        return this.body;
    }

}
