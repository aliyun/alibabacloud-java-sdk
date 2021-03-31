// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitInferenceJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitInferenceJobResponseBody body;

    public static SubmitInferenceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitInferenceJobResponse self = new SubmitInferenceJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitInferenceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitInferenceJobResponse setBody(SubmitInferenceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitInferenceJobResponseBody getBody() {
        return this.body;
    }

}
