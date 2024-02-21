// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventsInRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutonomousNotifyEventsInRangeResponseBody body;

    public static GetAutonomousNotifyEventsInRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutonomousNotifyEventsInRangeResponse self = new GetAutonomousNotifyEventsInRangeResponse();
        return TeaModel.build(map, self);
    }

    public GetAutonomousNotifyEventsInRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutonomousNotifyEventsInRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutonomousNotifyEventsInRangeResponse setBody(GetAutonomousNotifyEventsInRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutonomousNotifyEventsInRangeResponseBody getBody() {
        return this.body;
    }

}
