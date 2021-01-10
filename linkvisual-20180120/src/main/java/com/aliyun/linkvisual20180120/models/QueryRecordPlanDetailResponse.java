// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryRecordPlanDetailResponse setBody(QueryRecordPlanDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordPlanDetailResponseBody getBody() {
        return this.body;
    }

}
