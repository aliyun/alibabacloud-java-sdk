// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRCSTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRCSTemplateResponseBody body;

    public static QueryRCSTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRCSTemplateResponse self = new QueryRCSTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryRCSTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRCSTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRCSTemplateResponse setBody(QueryRCSTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRCSTemplateResponseBody getBody() {
        return this.body;
    }

}
