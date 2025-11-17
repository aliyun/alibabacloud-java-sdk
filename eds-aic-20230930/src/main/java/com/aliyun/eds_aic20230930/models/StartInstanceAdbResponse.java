// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StartInstanceAdbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartInstanceAdbResponseBody body;

    public static StartInstanceAdbResponse build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceAdbResponse self = new StartInstanceAdbResponse();
        return TeaModel.build(map, self);
    }

    public StartInstanceAdbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartInstanceAdbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartInstanceAdbResponse setBody(StartInstanceAdbResponseBody body) {
        this.body = body;
        return this;
    }
    public StartInstanceAdbResponseBody getBody() {
        return this.body;
    }

}
