// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ListAuditPassEnterpriseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuditPassEnterpriseInfoResponseBody body;

    public static ListAuditPassEnterpriseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuditPassEnterpriseInfoResponse self = new ListAuditPassEnterpriseInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListAuditPassEnterpriseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuditPassEnterpriseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuditPassEnterpriseInfoResponse setBody(ListAuditPassEnterpriseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuditPassEnterpriseInfoResponseBody getBody() {
        return this.body;
    }

}
