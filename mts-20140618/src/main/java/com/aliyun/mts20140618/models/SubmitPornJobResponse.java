// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitPornJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitPornJobResponseBody body;

    public static SubmitPornJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPornJobResponse self = new SubmitPornJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPornJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPornJobResponse setBody(SubmitPornJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPornJobResponseBody getBody() {
        return this.body;
    }

}
