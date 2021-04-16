// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitH2VJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitH2VJobResponseBody body;

    public static SubmitH2VJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitH2VJobResponse self = new SubmitH2VJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitH2VJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitH2VJobResponse setBody(SubmitH2VJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitH2VJobResponseBody getBody() {
        return this.body;
    }

}
