// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaFpDeleteJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitMediaFpDeleteJobResponseBody body;

    public static SubmitMediaFpDeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaFpDeleteJobResponse self = new SubmitMediaFpDeleteJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMediaFpDeleteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMediaFpDeleteJobResponse setBody(SubmitMediaFpDeleteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaFpDeleteJobResponseBody getBody() {
        return this.body;
    }

}
