// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartLiveIndexResponseBody body;

    public static StartLiveIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLiveIndexResponse self = new StartLiveIndexResponse();
        return TeaModel.build(map, self);
    }

    public StartLiveIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLiveIndexResponse setBody(StartLiveIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLiveIndexResponseBody getBody() {
        return this.body;
    }

}
