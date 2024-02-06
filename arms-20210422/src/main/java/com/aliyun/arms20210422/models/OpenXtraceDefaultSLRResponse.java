// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class OpenXtraceDefaultSLRResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenXtraceDefaultSLRResponseBody body;

    public static OpenXtraceDefaultSLRResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenXtraceDefaultSLRResponse self = new OpenXtraceDefaultSLRResponse();
        return TeaModel.build(map, self);
    }

    public OpenXtraceDefaultSLRResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenXtraceDefaultSLRResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenXtraceDefaultSLRResponse setBody(OpenXtraceDefaultSLRResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenXtraceDefaultSLRResponseBody getBody() {
        return this.body;
    }

}
