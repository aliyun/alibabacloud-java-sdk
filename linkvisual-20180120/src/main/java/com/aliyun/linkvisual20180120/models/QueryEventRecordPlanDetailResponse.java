// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEventRecordPlanDetailResponseBody body;

    public static QueryEventRecordPlanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDetailResponse self = new QueryEventRecordPlanDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEventRecordPlanDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEventRecordPlanDetailResponse setBody(QueryEventRecordPlanDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventRecordPlanDetailResponseBody getBody() {
        return this.body;
    }

}
