// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitFactAuditUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitFactAuditUrlResponseBody body;

    public static SubmitFactAuditUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFactAuditUrlResponse self = new SubmitFactAuditUrlResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFactAuditUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFactAuditUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitFactAuditUrlResponse setBody(SubmitFactAuditUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFactAuditUrlResponseBody getBody() {
        return this.body;
    }

}
