// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryStandarTemplateCollectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStandarTemplateCollectionsResponseBody body;

    public static QueryStandarTemplateCollectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStandarTemplateCollectionsResponse self = new QueryStandarTemplateCollectionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryStandarTemplateCollectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStandarTemplateCollectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStandarTemplateCollectionsResponse setBody(QueryStandarTemplateCollectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStandarTemplateCollectionsResponseBody getBody() {
        return this.body;
    }

}
