// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectSpineMRIResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectSpineMRIResponseBody body;

    public static DetectSpineMRIResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectSpineMRIResponse self = new DetectSpineMRIResponse();
        return TeaModel.build(map, self);
    }

    public DetectSpineMRIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectSpineMRIResponse setBody(DetectSpineMRIResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectSpineMRIResponseBody getBody() {
        return this.body;
    }

}
