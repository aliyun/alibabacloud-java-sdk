// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryOneKeyDeleteBlockListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOneKeyDeleteBlockListResponseBody body;

    public static QueryOneKeyDeleteBlockListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOneKeyDeleteBlockListResponse self = new QueryOneKeyDeleteBlockListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOneKeyDeleteBlockListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOneKeyDeleteBlockListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOneKeyDeleteBlockListResponse setBody(QueryOneKeyDeleteBlockListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOneKeyDeleteBlockListResponseBody getBody() {
        return this.body;
    }

}
