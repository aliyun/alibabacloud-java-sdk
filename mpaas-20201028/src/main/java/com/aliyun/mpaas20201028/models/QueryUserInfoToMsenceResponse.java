// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryUserInfoToMsenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUserInfoToMsenceResponseBody body;

    public static QueryUserInfoToMsenceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoToMsenceResponse self = new QueryUserInfoToMsenceResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoToMsenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserInfoToMsenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUserInfoToMsenceResponse setBody(QueryUserInfoToMsenceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserInfoToMsenceResponseBody getBody() {
        return this.body;
    }

}
