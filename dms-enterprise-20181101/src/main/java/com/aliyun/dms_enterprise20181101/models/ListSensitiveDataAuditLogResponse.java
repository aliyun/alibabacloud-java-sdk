// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveDataAuditLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSensitiveDataAuditLogResponseBody body;

    public static ListSensitiveDataAuditLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveDataAuditLogResponse self = new ListSensitiveDataAuditLogResponse();
        return TeaModel.build(map, self);
    }

    public ListSensitiveDataAuditLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSensitiveDataAuditLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSensitiveDataAuditLogResponse setBody(ListSensitiveDataAuditLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSensitiveDataAuditLogResponseBody getBody() {
        return this.body;
    }

}
