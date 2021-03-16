// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpFileDeleteJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitFpFileDeleteJobResponseBody body;

    public static SubmitFpFileDeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpFileDeleteJobResponse self = new SubmitFpFileDeleteJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFpFileDeleteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFpFileDeleteJobResponse setBody(SubmitFpFileDeleteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFpFileDeleteJobResponseBody getBody() {
        return this.body;
    }

}
