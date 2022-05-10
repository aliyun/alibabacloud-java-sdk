// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimProAgainBuildModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BimProAgainBuildModeResponseBody body;

    public static BimProAgainBuildModeResponse build(java.util.Map<String, ?> map) throws Exception {
        BimProAgainBuildModeResponse self = new BimProAgainBuildModeResponse();
        return TeaModel.build(map, self);
    }

    public BimProAgainBuildModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimProAgainBuildModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BimProAgainBuildModeResponse setBody(BimProAgainBuildModeResponseBody body) {
        this.body = body;
        return this;
    }
    public BimProAgainBuildModeResponseBody getBody() {
        return this.body;
    }

}
