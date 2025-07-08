// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryStandarTemplateCollectionsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStandarTemplateCollectionsNewResponseBody body;

    public static QueryStandarTemplateCollectionsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStandarTemplateCollectionsNewResponse self = new QueryStandarTemplateCollectionsNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryStandarTemplateCollectionsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStandarTemplateCollectionsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStandarTemplateCollectionsNewResponse setBody(QueryStandarTemplateCollectionsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStandarTemplateCollectionsNewResponseBody getBody() {
        return this.body;
    }

}
