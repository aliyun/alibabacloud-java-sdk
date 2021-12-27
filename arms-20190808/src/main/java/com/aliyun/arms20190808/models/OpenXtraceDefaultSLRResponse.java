// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenXtraceDefaultSLRResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public OpenXtraceDefaultSLRResponse setBody(OpenXtraceDefaultSLRResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenXtraceDefaultSLRResponseBody getBody() {
        return this.body;
    }

}
