// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventsInRangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetAutonomousNotifyEventsInRangeResponse setBody(GetAutonomousNotifyEventsInRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutonomousNotifyEventsInRangeResponseBody getBody() {
        return this.body;
    }

}
