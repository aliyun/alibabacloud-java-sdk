// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitVideoPoseJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitVideoPoseJobResponseBody body;

    public static SubmitVideoPoseJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoPoseJobResponse self = new SubmitVideoPoseJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoPoseJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoPoseJobResponse setBody(SubmitVideoPoseJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoPoseJobResponseBody getBody() {
        return this.body;
    }

}
