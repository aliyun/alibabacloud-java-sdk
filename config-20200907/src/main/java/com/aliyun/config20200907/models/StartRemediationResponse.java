// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartRemediationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRemediationResponseBody body;

    public static StartRemediationResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRemediationResponse self = new StartRemediationResponse();
        return TeaModel.build(map, self);
    }

    public StartRemediationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRemediationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRemediationResponse setBody(StartRemediationResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRemediationResponseBody getBody() {
        return this.body;
    }

}
