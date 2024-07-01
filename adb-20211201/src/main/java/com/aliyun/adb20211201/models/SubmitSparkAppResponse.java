// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SubmitSparkAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSparkAppResponseBody body;

    public static SubmitSparkAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkAppResponse self = new SubmitSparkAppResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSparkAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSparkAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSparkAppResponse setBody(SubmitSparkAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSparkAppResponseBody getBody() {
        return this.body;
    }

}
