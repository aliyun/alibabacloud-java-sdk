// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySubUserAuthListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySubUserAuthListResponseBody body;

    public static QuerySubUserAuthListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySubUserAuthListResponse self = new QuerySubUserAuthListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySubUserAuthListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySubUserAuthListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySubUserAuthListResponse setBody(QuerySubUserAuthListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySubUserAuthListResponseBody getBody() {
        return this.body;
    }

}
