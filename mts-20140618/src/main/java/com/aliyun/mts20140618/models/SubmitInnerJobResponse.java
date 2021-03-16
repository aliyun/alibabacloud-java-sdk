// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitInnerJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitInnerJobResponseBody body;

    public static SubmitInnerJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerJobResponse self = new SubmitInnerJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitInnerJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitInnerJobResponse setBody(SubmitInnerJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitInnerJobResponseBody getBody() {
        return this.body;
    }

}
