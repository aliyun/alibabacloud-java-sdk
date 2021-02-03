// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIRJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitIRJobResponseBody body;

    public static SubmitIRJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitIRJobResponse self = new SubmitIRJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitIRJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitIRJobResponse setBody(SubmitIRJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitIRJobResponseBody getBody() {
        return this.body;
    }

}
