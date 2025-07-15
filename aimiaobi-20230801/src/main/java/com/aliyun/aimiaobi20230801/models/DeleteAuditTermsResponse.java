// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteAuditTermsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAuditTermsResponseBody body;

    public static DeleteAuditTermsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuditTermsResponse self = new DeleteAuditTermsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuditTermsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuditTermsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAuditTermsResponse setBody(DeleteAuditTermsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuditTermsResponseBody getBody() {
        return this.body;
    }

}
