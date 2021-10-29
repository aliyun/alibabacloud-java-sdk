// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAutonomousNotifyEventsResponseBody body;

    public static GetAutonomousNotifyEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutonomousNotifyEventsResponse self = new GetAutonomousNotifyEventsResponse();
        return TeaModel.build(map, self);
    }

    public GetAutonomousNotifyEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutonomousNotifyEventsResponse setBody(GetAutonomousNotifyEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutonomousNotifyEventsResponseBody getBody() {
        return this.body;
    }

}
