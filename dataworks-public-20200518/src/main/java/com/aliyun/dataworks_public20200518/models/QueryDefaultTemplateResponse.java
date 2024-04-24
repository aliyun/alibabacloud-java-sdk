// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDefaultTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDefaultTemplateResponseBody body;

    public static QueryDefaultTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDefaultTemplateResponse self = new QueryDefaultTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryDefaultTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDefaultTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDefaultTemplateResponse setBody(QueryDefaultTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDefaultTemplateResponseBody getBody() {
        return this.body;
    }

}
