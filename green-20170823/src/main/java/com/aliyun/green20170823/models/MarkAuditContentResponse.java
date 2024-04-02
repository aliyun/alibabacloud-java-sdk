// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkAuditContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MarkAuditContentResponseBody body;

    public static MarkAuditContentResponse build(java.util.Map<String, ?> map) throws Exception {
        MarkAuditContentResponse self = new MarkAuditContentResponse();
        return TeaModel.build(map, self);
    }

    public MarkAuditContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MarkAuditContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MarkAuditContentResponse setBody(MarkAuditContentResponseBody body) {
        this.body = body;
        return this;
    }
    public MarkAuditContentResponseBody getBody() {
        return this.body;
    }

}
