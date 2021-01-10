// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitTagJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitTagJobResponseBody body;

    public static SubmitTagJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTagJobResponse self = new SubmitTagJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTagJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTagJobResponse setBody(SubmitTagJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTagJobResponseBody getBody() {
        return this.body;
    }

}
