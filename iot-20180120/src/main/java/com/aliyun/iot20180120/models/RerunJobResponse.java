// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RerunJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RerunJobResponseBody body;

    public static RerunJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RerunJobResponse self = new RerunJobResponse();
        return TeaModel.build(map, self);
    }

    public RerunJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RerunJobResponse setBody(RerunJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RerunJobResponseBody getBody() {
        return this.body;
    }

}
