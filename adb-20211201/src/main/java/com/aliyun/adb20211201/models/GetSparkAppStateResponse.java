// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkAppStateResponseBody body;

    public static GetSparkAppStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppStateResponse self = new GetSparkAppStateResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkAppStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkAppStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkAppStateResponse setBody(GetSparkAppStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkAppStateResponseBody getBody() {
        return this.body;
    }

}
