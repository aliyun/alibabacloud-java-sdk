// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class DetectAigcImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectAigcImageResponseBody body;

    public static DetectAigcImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectAigcImageResponse self = new DetectAigcImageResponse();
        return TeaModel.build(map, self);
    }

    public DetectAigcImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectAigcImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectAigcImageResponse setBody(DetectAigcImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectAigcImageResponseBody getBody() {
        return this.body;
    }

}
