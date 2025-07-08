// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryPhoneWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPhoneWhiteListResponseBody body;

    public static QueryPhoneWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneWhiteListResponse self = new QueryPhoneWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPhoneWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPhoneWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPhoneWhiteListResponse setBody(QueryPhoneWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPhoneWhiteListResponseBody getBody() {
        return this.body;
    }

}
