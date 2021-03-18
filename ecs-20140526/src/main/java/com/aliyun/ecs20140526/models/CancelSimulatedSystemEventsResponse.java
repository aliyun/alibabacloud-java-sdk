// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelSimulatedSystemEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelSimulatedSystemEventsResponseBody body;

    public static CancelSimulatedSystemEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSimulatedSystemEventsResponse self = new CancelSimulatedSystemEventsResponse();
        return TeaModel.build(map, self);
    }

    public CancelSimulatedSystemEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSimulatedSystemEventsResponse setBody(CancelSimulatedSystemEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSimulatedSystemEventsResponseBody getBody() {
        return this.body;
    }

}
