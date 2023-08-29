// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryConferenceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryConferenceInfoResponseBody body;

    public static QueryConferenceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConferenceInfoResponse self = new QueryConferenceInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryConferenceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConferenceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConferenceInfoResponse setBody(QueryConferenceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConferenceInfoResponseBody getBody() {
        return this.body;
    }

}
