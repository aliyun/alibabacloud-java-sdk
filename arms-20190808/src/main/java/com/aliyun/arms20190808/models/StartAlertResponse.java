// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StartAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartAlertResponseBody body;

    public static StartAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAlertResponse self = new StartAlertResponse();
        return TeaModel.build(map, self);
    }

    public StartAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAlertResponse setBody(StartAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAlertResponseBody getBody() {
        return this.body;
    }

}
