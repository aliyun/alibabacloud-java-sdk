// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitVideoAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitVideoAuditResponseBody body;

    public static SubmitVideoAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoAuditResponse self = new SubmitVideoAuditResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVideoAuditResponse setBody(SubmitVideoAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoAuditResponseBody getBody() {
        return this.body;
    }

}
