// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDeviceByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEventRecordPlanDeviceByDeviceResponseBody body;

    public static QueryEventRecordPlanDeviceByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDeviceByDeviceResponse self = new QueryEventRecordPlanDeviceByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDeviceByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEventRecordPlanDeviceByDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEventRecordPlanDeviceByDeviceResponse setBody(QueryEventRecordPlanDeviceByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventRecordPlanDeviceByDeviceResponseBody getBody() {
        return this.body;
    }

}
