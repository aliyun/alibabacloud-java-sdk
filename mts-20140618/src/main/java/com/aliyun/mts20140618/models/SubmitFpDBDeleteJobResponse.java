// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpDBDeleteJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitFpDBDeleteJobResponseBody body;

    public static SubmitFpDBDeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpDBDeleteJobResponse self = new SubmitFpDBDeleteJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFpDBDeleteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFpDBDeleteJobResponse setBody(SubmitFpDBDeleteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFpDBDeleteJobResponseBody getBody() {
        return this.body;
    }

}
