// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDeviceByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRecordPlanDeviceByDeviceResponseBody body;

    public static QueryRecordPlanDeviceByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDeviceByDeviceResponse self = new QueryRecordPlanDeviceByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDeviceByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordPlanDeviceByDeviceResponse setBody(QueryRecordPlanDeviceByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordPlanDeviceByDeviceResponseBody getBody() {
        return this.body;
    }

}
