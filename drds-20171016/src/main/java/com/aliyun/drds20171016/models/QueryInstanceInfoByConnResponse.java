// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class QueryInstanceInfoByConnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInstanceInfoByConnResponseBody body;

    public static QueryInstanceInfoByConnResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceInfoByConnResponse self = new QueryInstanceInfoByConnResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceInfoByConnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInstanceInfoByConnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInstanceInfoByConnResponse setBody(QueryInstanceInfoByConnResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInstanceInfoByConnResponseBody getBody() {
        return this.body;
    }

}
