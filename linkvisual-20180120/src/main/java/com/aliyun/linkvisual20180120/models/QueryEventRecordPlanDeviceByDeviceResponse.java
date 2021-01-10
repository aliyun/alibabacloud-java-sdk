// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDeviceByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryEventRecordPlanDeviceByDeviceResponse setBody(QueryEventRecordPlanDeviceByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventRecordPlanDeviceByDeviceResponseBody getBody() {
        return this.body;
    }

}
