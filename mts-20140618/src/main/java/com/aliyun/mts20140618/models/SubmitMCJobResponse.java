// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMCJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitMCJobResponseBody body;

    public static SubmitMCJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMCJobResponse self = new SubmitMCJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMCJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMCJobResponse setBody(SubmitMCJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMCJobResponseBody getBody() {
        return this.body;
    }

}
