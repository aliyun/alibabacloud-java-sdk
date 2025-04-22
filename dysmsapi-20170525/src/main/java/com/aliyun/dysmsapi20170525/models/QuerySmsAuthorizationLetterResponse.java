// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsAuthorizationLetterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsAuthorizationLetterResponseBody body;

    public static QuerySmsAuthorizationLetterResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsAuthorizationLetterResponse self = new QuerySmsAuthorizationLetterResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsAuthorizationLetterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsAuthorizationLetterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsAuthorizationLetterResponse setBody(QuerySmsAuthorizationLetterResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsAuthorizationLetterResponseBody getBody() {
        return this.body;
    }

}
