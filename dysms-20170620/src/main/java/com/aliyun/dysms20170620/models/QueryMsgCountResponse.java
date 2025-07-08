// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMsgCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMsgCountResponseBody body;

    public static QueryMsgCountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsgCountResponse self = new QueryMsgCountResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsgCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsgCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMsgCountResponse setBody(QueryMsgCountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsgCountResponseBody getBody() {
        return this.body;
    }

}
