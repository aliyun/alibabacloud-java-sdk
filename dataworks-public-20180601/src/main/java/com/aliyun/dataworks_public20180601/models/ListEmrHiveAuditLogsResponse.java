// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListEmrHiveAuditLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEmrHiveAuditLogsResponseBody body;

    public static ListEmrHiveAuditLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEmrHiveAuditLogsResponse self = new ListEmrHiveAuditLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListEmrHiveAuditLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEmrHiveAuditLogsResponse setBody(ListEmrHiveAuditLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEmrHiveAuditLogsResponseBody getBody() {
        return this.body;
    }

}
