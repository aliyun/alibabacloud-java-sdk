// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StopInstanceAdbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopInstanceAdbResponseBody body;

    public static StopInstanceAdbResponse build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceAdbResponse self = new StopInstanceAdbResponse();
        return TeaModel.build(map, self);
    }

    public StopInstanceAdbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopInstanceAdbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopInstanceAdbResponse setBody(StopInstanceAdbResponseBody body) {
        this.body = body;
        return this;
    }
    public StopInstanceAdbResponseBody getBody() {
        return this.body;
    }

}
