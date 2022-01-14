// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CancelPushSchedulerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelPushSchedulerResponseBody body;

    public static CancelPushSchedulerResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPushSchedulerResponse self = new CancelPushSchedulerResponse();
        return TeaModel.build(map, self);
    }

    public CancelPushSchedulerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelPushSchedulerResponse setBody(CancelPushSchedulerResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelPushSchedulerResponseBody getBody() {
        return this.body;
    }

}
