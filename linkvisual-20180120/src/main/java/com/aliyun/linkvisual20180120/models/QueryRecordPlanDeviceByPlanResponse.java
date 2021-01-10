// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDeviceByPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRecordPlanDeviceByPlanResponseBody body;

    public static QueryRecordPlanDeviceByPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDeviceByPlanResponse self = new QueryRecordPlanDeviceByPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDeviceByPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordPlanDeviceByPlanResponse setBody(QueryRecordPlanDeviceByPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordPlanDeviceByPlanResponseBody getBody() {
        return this.body;
    }

}
