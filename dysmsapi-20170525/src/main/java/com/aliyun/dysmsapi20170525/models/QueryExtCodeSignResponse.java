// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryExtCodeSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryExtCodeSignResponseBody body;

    public static QueryExtCodeSignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExtCodeSignResponse self = new QueryExtCodeSignResponse();
        return TeaModel.build(map, self);
    }

    public QueryExtCodeSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExtCodeSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExtCodeSignResponse setBody(QueryExtCodeSignResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExtCodeSignResponseBody getBody() {
        return this.body;
    }

}
