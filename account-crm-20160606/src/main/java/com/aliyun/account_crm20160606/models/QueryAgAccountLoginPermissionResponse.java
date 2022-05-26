// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAgAccountLoginPermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAgAccountLoginPermissionResponseBody body;

    public static QueryAgAccountLoginPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgAccountLoginPermissionResponse self = new QueryAgAccountLoginPermissionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgAccountLoginPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAgAccountLoginPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAgAccountLoginPermissionResponse setBody(QueryAgAccountLoginPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAgAccountLoginPermissionResponseBody getBody() {
        return this.body;
    }

}
