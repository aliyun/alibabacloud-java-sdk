// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMattingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitMattingJobResponseBody body;

    public static SubmitMattingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMattingJobResponse self = new SubmitMattingJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMattingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMattingJobResponse setBody(SubmitMattingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMattingJobResponseBody getBody() {
        return this.body;
    }

}
