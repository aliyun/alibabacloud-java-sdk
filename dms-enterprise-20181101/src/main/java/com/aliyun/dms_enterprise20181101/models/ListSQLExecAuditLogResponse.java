// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLExecAuditLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSQLExecAuditLogResponseBody body;

    public static ListSQLExecAuditLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSQLExecAuditLogResponse self = new ListSQLExecAuditLogResponse();
        return TeaModel.build(map, self);
    }

    public ListSQLExecAuditLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSQLExecAuditLogResponse setBody(ListSQLExecAuditLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSQLExecAuditLogResponseBody getBody() {
        return this.body;
    }

}
