// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLReviewOriginSQLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSQLReviewOriginSQLResponseBody body;

    public static ListSQLReviewOriginSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSQLReviewOriginSQLResponse self = new ListSQLReviewOriginSQLResponse();
        return TeaModel.build(map, self);
    }

    public ListSQLReviewOriginSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSQLReviewOriginSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSQLReviewOriginSQLResponse setBody(ListSQLReviewOriginSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSQLReviewOriginSQLResponseBody getBody() {
        return this.body;
    }

}
