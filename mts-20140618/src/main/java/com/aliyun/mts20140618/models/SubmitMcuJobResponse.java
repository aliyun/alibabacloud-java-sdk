// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMcuJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitMcuJobResponseBody body;

    public static SubmitMcuJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMcuJobResponse self = new SubmitMcuJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMcuJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMcuJobResponse setBody(SubmitMcuJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMcuJobResponseBody getBody() {
        return this.body;
    }

}
