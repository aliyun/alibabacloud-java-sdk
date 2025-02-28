// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerKillSparkAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InnerKillSparkAppResponseBody body;

    public static InnerKillSparkAppResponse build(java.util.Map<String, ?> map) throws Exception {
        InnerKillSparkAppResponse self = new InnerKillSparkAppResponse();
        return TeaModel.build(map, self);
    }

    public InnerKillSparkAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InnerKillSparkAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InnerKillSparkAppResponse setBody(InnerKillSparkAppResponseBody body) {
        this.body = body;
        return this;
    }
    public InnerKillSparkAppResponseBody getBody() {
        return this.body;
    }

}
