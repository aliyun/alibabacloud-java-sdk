// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class StartJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartJobResponseBody body;

    public static StartJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartJobResponse self = new StartJobResponse();
        return TeaModel.build(map, self);
    }

    public StartJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartJobResponse setBody(StartJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartJobResponseBody getBody() {
        return this.body;
    }

}
