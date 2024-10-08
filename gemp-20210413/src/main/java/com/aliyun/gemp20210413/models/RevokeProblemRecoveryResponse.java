// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RevokeProblemRecoveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeProblemRecoveryResponseBody body;

    public static RevokeProblemRecoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeProblemRecoveryResponse self = new RevokeProblemRecoveryResponse();
        return TeaModel.build(map, self);
    }

    public RevokeProblemRecoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeProblemRecoveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeProblemRecoveryResponse setBody(RevokeProblemRecoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeProblemRecoveryResponseBody getBody() {
        return this.body;
    }

}
