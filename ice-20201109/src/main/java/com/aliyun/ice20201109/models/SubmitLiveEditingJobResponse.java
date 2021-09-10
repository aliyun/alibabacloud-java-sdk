// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitLiveEditingJobResponseBody body;

    public static SubmitLiveEditingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveEditingJobResponse self = new SubmitLiveEditingJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitLiveEditingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitLiveEditingJobResponse setBody(SubmitLiveEditingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitLiveEditingJobResponseBody getBody() {
        return this.body;
    }

}
