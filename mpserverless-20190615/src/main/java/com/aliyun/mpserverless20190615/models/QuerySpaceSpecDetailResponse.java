// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QuerySpaceSpecDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySpaceSpecDetailResponseBody body;

    public static QuerySpaceSpecDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpaceSpecDetailResponse self = new QuerySpaceSpecDetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpaceSpecDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpaceSpecDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySpaceSpecDetailResponse setBody(QuerySpaceSpecDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpaceSpecDetailResponseBody getBody() {
        return this.body;
    }

}
