// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KillSparkAppResponseBody body;

    public static KillSparkAppResponse build(java.util.Map<String, ?> map) throws Exception {
        KillSparkAppResponse self = new KillSparkAppResponse();
        return TeaModel.build(map, self);
    }

    public KillSparkAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillSparkAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KillSparkAppResponse setBody(KillSparkAppResponseBody body) {
        this.body = body;
        return this;
    }
    public KillSparkAppResponseBody getBody() {
        return this.body;
    }

}
