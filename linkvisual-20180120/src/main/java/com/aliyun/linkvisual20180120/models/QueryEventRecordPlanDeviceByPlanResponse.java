// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDeviceByPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEventRecordPlanDeviceByPlanResponseBody body;

    public static QueryEventRecordPlanDeviceByPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDeviceByPlanResponse self = new QueryEventRecordPlanDeviceByPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDeviceByPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEventRecordPlanDeviceByPlanResponse setBody(QueryEventRecordPlanDeviceByPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventRecordPlanDeviceByPlanResponseBody getBody() {
        return this.body;
    }

}
