// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class StopCallInConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopCallInConfigResponseBody body;

    public static StopCallInConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCallInConfigResponse self = new StopCallInConfigResponse();
        return TeaModel.build(map, self);
    }

    public StopCallInConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCallInConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopCallInConfigResponse setBody(StopCallInConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCallInConfigResponseBody getBody() {
        return this.body;
    }

}
