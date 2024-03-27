// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstanceLoginAuditLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceLoginAuditLogResponseBody body;

    public static ListInstanceLoginAuditLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceLoginAuditLogResponse self = new ListInstanceLoginAuditLogResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceLoginAuditLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceLoginAuditLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceLoginAuditLogResponse setBody(ListInstanceLoginAuditLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceLoginAuditLogResponseBody getBody() {
        return this.body;
    }

}
