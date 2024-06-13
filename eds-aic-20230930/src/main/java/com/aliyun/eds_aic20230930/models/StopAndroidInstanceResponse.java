// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StopAndroidInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAndroidInstanceResponseBody body;

    public static StopAndroidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAndroidInstanceResponse self = new StopAndroidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopAndroidInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAndroidInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAndroidInstanceResponse setBody(StopAndroidInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAndroidInstanceResponseBody getBody() {
        return this.body;
    }

}
