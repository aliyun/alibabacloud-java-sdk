// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaProducingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitMediaProducingJobResponseBody body;

    public static SubmitMediaProducingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaProducingJobResponse self = new SubmitMediaProducingJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMediaProducingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMediaProducingJobResponse setBody(SubmitMediaProducingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaProducingJobResponseBody getBody() {
        return this.body;
    }

}
