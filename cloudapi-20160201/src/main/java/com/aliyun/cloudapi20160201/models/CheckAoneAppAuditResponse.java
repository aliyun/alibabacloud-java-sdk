// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CheckAoneAppAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckAoneAppAuditResponseBody body;

    public static CheckAoneAppAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAoneAppAuditResponse self = new CheckAoneAppAuditResponse();
        return TeaModel.build(map, self);
    }

    public CheckAoneAppAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAoneAppAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAoneAppAuditResponse setBody(CheckAoneAppAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAoneAppAuditResponseBody getBody() {
        return this.body;
    }

}
