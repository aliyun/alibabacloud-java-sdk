// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryDPUtilizationDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDPUtilizationDetailResponseBody body;

    public static QueryDPUtilizationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDPUtilizationDetailResponse self = new QueryDPUtilizationDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryDPUtilizationDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDPUtilizationDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDPUtilizationDetailResponse setBody(QueryDPUtilizationDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDPUtilizationDetailResponseBody getBody() {
        return this.body;
    }

}
