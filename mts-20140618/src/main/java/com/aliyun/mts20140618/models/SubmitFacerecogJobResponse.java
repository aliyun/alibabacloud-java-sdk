// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFacerecogJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitFacerecogJobResponseBody body;

    public static SubmitFacerecogJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFacerecogJobResponse self = new SubmitFacerecogJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFacerecogJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFacerecogJobResponse setBody(SubmitFacerecogJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFacerecogJobResponseBody getBody() {
        return this.body;
    }

}
