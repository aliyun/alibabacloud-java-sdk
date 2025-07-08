// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryStandardProtocolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStandardProtocolResponseBody body;

    public static QueryStandardProtocolResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStandardProtocolResponse self = new QueryStandardProtocolResponse();
        return TeaModel.build(map, self);
    }

    public QueryStandardProtocolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStandardProtocolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStandardProtocolResponse setBody(QueryStandardProtocolResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStandardProtocolResponseBody getBody() {
        return this.body;
    }

}
