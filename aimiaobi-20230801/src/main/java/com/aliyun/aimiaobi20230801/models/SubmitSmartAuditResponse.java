// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitSmartAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSmartAuditResponseBody body;

    public static SubmitSmartAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartAuditResponse self = new SubmitSmartAuditResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSmartAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSmartAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSmartAuditResponse setBody(SubmitSmartAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSmartAuditResponseBody getBody() {
        return this.body;
    }

}
