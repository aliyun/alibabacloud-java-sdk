// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAuditTermsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuditTermsResponseBody body;

    public static ListAuditTermsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuditTermsResponse self = new ListAuditTermsResponse();
        return TeaModel.build(map, self);
    }

    public ListAuditTermsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuditTermsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuditTermsResponse setBody(ListAuditTermsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuditTermsResponseBody getBody() {
        return this.body;
    }

}
