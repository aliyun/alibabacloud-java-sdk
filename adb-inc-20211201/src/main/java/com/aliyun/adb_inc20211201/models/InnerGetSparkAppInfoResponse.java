// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerGetSparkAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InnerGetSparkAppInfoResponseBody body;

    public static InnerGetSparkAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        InnerGetSparkAppInfoResponse self = new InnerGetSparkAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public InnerGetSparkAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InnerGetSparkAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InnerGetSparkAppInfoResponse setBody(InnerGetSparkAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public InnerGetSparkAppInfoResponseBody getBody() {
        return this.body;
    }

}
