// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartDtsJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartDtsJobResponseBody body;

    public static StartDtsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDtsJobResponse self = new StartDtsJobResponse();
        return TeaModel.build(map, self);
    }

    public StartDtsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDtsJobResponse setBody(StartDtsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDtsJobResponseBody getBody() {
        return this.body;
    }

}
