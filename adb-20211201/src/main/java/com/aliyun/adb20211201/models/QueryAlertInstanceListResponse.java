// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class QueryAlertInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAlertInstanceListResponseBody body;

    public static QueryAlertInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertInstanceListResponse self = new QueryAlertInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlertInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAlertInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAlertInstanceListResponse setBody(QueryAlertInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAlertInstanceListResponseBody getBody() {
        return this.body;
    }

}
