// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveScheduleMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveScheduleMonitorResponseBody body;

    public static RemoveScheduleMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveScheduleMonitorResponse self = new RemoveScheduleMonitorResponse();
        return TeaModel.build(map, self);
    }

    public RemoveScheduleMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveScheduleMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveScheduleMonitorResponse setBody(RemoveScheduleMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveScheduleMonitorResponseBody getBody() {
        return this.body;
    }

}
