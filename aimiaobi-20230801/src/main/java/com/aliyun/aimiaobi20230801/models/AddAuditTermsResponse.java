// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AddAuditTermsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAuditTermsResponseBody body;

    public static AddAuditTermsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAuditTermsResponse self = new AddAuditTermsResponse();
        return TeaModel.build(map, self);
    }

    public AddAuditTermsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAuditTermsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAuditTermsResponse setBody(AddAuditTermsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAuditTermsResponseBody getBody() {
        return this.body;
    }

}
