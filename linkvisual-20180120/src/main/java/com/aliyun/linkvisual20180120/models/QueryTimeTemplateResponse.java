// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryTimeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTimeTemplateResponseBody body;

    public static QueryTimeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTimeTemplateResponse self = new QueryTimeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryTimeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTimeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTimeTemplateResponse setBody(QueryTimeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTimeTemplateResponseBody getBody() {
        return this.body;
    }

}
