// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryQualificationDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryQualificationDetailResponseBody body;

    public static QueryQualificationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQualificationDetailResponse self = new QueryQualificationDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryQualificationDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQualificationDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryQualificationDetailResponse setBody(QueryQualificationDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQualificationDetailResponseBody getBody() {
        return this.body;
    }

}
