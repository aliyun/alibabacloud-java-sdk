// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryAvailableAuthCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAvailableAuthCodeResponseBody body;

    public static QueryAvailableAuthCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableAuthCodeResponse self = new QueryAvailableAuthCodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvailableAuthCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAvailableAuthCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAvailableAuthCodeResponse setBody(QueryAvailableAuthCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAvailableAuthCodeResponseBody getBody() {
        return this.body;
    }

}
