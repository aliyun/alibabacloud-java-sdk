// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QueryTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTemplateListResponseBody body;

    public static QueryTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateListResponse self = new QueryTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTemplateListResponse setBody(QueryTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTemplateListResponseBody getBody() {
        return this.body;
    }

}
