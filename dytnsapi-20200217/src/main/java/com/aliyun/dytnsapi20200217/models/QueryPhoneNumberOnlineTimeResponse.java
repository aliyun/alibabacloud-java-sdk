// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryPhoneNumberOnlineTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPhoneNumberOnlineTimeResponseBody body;

    public static QueryPhoneNumberOnlineTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneNumberOnlineTimeResponse self = new QueryPhoneNumberOnlineTimeResponse();
        return TeaModel.build(map, self);
    }

    public QueryPhoneNumberOnlineTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPhoneNumberOnlineTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPhoneNumberOnlineTimeResponse setBody(QueryPhoneNumberOnlineTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPhoneNumberOnlineTimeResponseBody getBody() {
        return this.body;
    }

}
