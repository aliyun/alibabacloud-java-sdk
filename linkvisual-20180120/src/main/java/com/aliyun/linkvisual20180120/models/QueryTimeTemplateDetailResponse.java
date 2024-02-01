// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryTimeTemplateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTimeTemplateDetailResponseBody body;

    public static QueryTimeTemplateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTimeTemplateDetailResponse self = new QueryTimeTemplateDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTimeTemplateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTimeTemplateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTimeTemplateDetailResponse setBody(QueryTimeTemplateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTimeTemplateDetailResponseBody getBody() {
        return this.body;
    }

}
