// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryOpencFlagNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOpencFlagNewResponseBody body;

    public static QueryOpencFlagNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOpencFlagNewResponse self = new QueryOpencFlagNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryOpencFlagNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOpencFlagNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOpencFlagNewResponse setBody(QueryOpencFlagNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOpencFlagNewResponseBody getBody() {
        return this.body;
    }

}
