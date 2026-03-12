// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryContactTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryContactTemplateResponseBody body;

    public static QueryContactTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContactTemplateResponse self = new QueryContactTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryContactTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryContactTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryContactTemplateResponse setBody(QueryContactTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryContactTemplateResponseBody getBody() {
        return this.body;
    }

}
