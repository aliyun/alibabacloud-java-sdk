// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectMaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectMaskResponseBody body;

    public static DetectMaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectMaskResponse self = new DetectMaskResponse();
        return TeaModel.build(map, self);
    }

    public DetectMaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectMaskResponse setBody(DetectMaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectMaskResponseBody getBody() {
        return this.body;
    }

}
