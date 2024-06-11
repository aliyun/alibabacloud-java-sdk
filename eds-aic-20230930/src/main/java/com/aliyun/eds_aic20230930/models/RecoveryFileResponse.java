// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RecoveryFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoveryFileResponseBody body;

    public static RecoveryFileResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoveryFileResponse self = new RecoveryFileResponse();
        return TeaModel.build(map, self);
    }

    public RecoveryFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoveryFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoveryFileResponse setBody(RecoveryFileResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoveryFileResponseBody getBody() {
        return this.body;
    }

}
