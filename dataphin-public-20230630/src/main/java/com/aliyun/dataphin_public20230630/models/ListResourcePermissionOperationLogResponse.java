// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListResourcePermissionOperationLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourcePermissionOperationLogResponseBody body;

    public static ListResourcePermissionOperationLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourcePermissionOperationLogResponse self = new ListResourcePermissionOperationLogResponse();
        return TeaModel.build(map, self);
    }

    public ListResourcePermissionOperationLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourcePermissionOperationLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourcePermissionOperationLogResponse setBody(ListResourcePermissionOperationLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourcePermissionOperationLogResponseBody getBody() {
        return this.body;
    }

}
