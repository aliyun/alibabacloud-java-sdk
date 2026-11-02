// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMiniGameQualificationByAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMiniGameQualificationByAppResponseBody body;

    public static QueryMiniGameQualificationByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniGameQualificationByAppResponse self = new QueryMiniGameQualificationByAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryMiniGameQualificationByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMiniGameQualificationByAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMiniGameQualificationByAppResponse setBody(QueryMiniGameQualificationByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMiniGameQualificationByAppResponseBody getBody() {
        return this.body;
    }

}
