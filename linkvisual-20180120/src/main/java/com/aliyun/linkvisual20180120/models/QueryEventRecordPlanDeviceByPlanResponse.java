// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDeviceByPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryEventRecordPlanDeviceByPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEventRecordPlanDeviceByPlanResponse setBody(QueryEventRecordPlanDeviceByPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventRecordPlanDeviceByPlanResponseBody getBody() {
        return this.body;
    }

}
