// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySmarttagTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmarttagTemplateListResponseBody body;

    public static QuerySmarttagTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmarttagTemplateListResponse self = new QuerySmarttagTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmarttagTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmarttagTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmarttagTemplateListResponse setBody(QuerySmarttagTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmarttagTemplateListResponseBody getBody() {
        return this.body;
    }

}
