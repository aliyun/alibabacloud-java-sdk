// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class QueryMailAddressByParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMailAddressByParamResponseBody body;

    public static QueryMailAddressByParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMailAddressByParamResponse self = new QueryMailAddressByParamResponse();
        return TeaModel.build(map, self);
    }

    public QueryMailAddressByParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMailAddressByParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMailAddressByParamResponse setBody(QueryMailAddressByParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMailAddressByParamResponseBody getBody() {
        return this.body;
    }

}
