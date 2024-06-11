// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StartAndroidInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAndroidInstanceResponseBody body;

    public static StartAndroidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAndroidInstanceResponse self = new StartAndroidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartAndroidInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAndroidInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAndroidInstanceResponse setBody(StartAndroidInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAndroidInstanceResponseBody getBody() {
        return this.body;
    }

}
