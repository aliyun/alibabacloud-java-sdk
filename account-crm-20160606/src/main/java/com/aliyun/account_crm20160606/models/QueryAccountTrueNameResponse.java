// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountTrueNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccountTrueNameResponseBody body;

    public static QueryAccountTrueNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTrueNameResponse self = new QueryAccountTrueNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountTrueNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountTrueNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccountTrueNameResponse setBody(QueryAccountTrueNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountTrueNameResponseBody getBody() {
        return this.body;
    }

}
