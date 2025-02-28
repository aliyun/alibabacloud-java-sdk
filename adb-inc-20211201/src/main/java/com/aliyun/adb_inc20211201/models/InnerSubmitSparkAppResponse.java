// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerSubmitSparkAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InnerSubmitSparkAppResponseBody body;

    public static InnerSubmitSparkAppResponse build(java.util.Map<String, ?> map) throws Exception {
        InnerSubmitSparkAppResponse self = new InnerSubmitSparkAppResponse();
        return TeaModel.build(map, self);
    }

    public InnerSubmitSparkAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InnerSubmitSparkAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InnerSubmitSparkAppResponse setBody(InnerSubmitSparkAppResponseBody body) {
        this.body = body;
        return this;
    }
    public InnerSubmitSparkAppResponseBody getBody() {
        return this.body;
    }

}
