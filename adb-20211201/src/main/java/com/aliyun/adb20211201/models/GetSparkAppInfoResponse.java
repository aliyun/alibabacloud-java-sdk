// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkAppInfoResponseBody body;

    public static GetSparkAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppInfoResponse self = new GetSparkAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkAppInfoResponse setBody(GetSparkAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkAppInfoResponseBody getBody() {
        return this.body;
    }

}
