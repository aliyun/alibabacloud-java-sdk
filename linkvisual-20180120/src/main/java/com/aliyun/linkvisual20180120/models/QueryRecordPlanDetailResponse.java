// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecordPlanDetailResponseBody body;

    public static QueryRecordPlanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDetailResponse self = new QueryRecordPlanDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordPlanDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecordPlanDetailResponse setBody(QueryRecordPlanDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordPlanDetailResponseBody getBody() {
        return this.body;
    }

}
