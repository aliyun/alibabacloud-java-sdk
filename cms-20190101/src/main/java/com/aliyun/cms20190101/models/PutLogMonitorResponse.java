// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutLogMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutLogMonitorResponseBody body;

    public static PutLogMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        PutLogMonitorResponse self = new PutLogMonitorResponse();
        return TeaModel.build(map, self);
    }

    public PutLogMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutLogMonitorResponse setBody(PutLogMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public PutLogMonitorResponseBody getBody() {
        return this.body;
    }

}
