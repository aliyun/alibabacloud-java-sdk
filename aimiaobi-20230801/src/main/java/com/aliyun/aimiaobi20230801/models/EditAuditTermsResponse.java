// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class EditAuditTermsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditAuditTermsResponseBody body;

    public static EditAuditTermsResponse build(java.util.Map<String, ?> map) throws Exception {
        EditAuditTermsResponse self = new EditAuditTermsResponse();
        return TeaModel.build(map, self);
    }

    public EditAuditTermsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditAuditTermsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditAuditTermsResponse setBody(EditAuditTermsResponseBody body) {
        this.body = body;
        return this;
    }
    public EditAuditTermsResponseBody getBody() {
        return this.body;
    }

}
