// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryCollectionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCollectionDataResponseBody body;

    public static QueryCollectionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCollectionDataResponse self = new QueryCollectionDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryCollectionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCollectionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCollectionDataResponse setBody(QueryCollectionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCollectionDataResponseBody getBody() {
        return this.body;
    }

}
