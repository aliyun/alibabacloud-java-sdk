// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QueryWaterMarkTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWaterMarkTemplateListResponseBody body;

    public static QueryWaterMarkTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWaterMarkTemplateListResponse self = new QueryWaterMarkTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public QueryWaterMarkTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWaterMarkTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWaterMarkTemplateListResponse setBody(QueryWaterMarkTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWaterMarkTemplateListResponseBody getBody() {
        return this.body;
    }

}
