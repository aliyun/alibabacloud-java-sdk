// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCoverJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitCoverJobResponseBody body;

    public static SubmitCoverJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCoverJobResponse self = new SubmitCoverJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCoverJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCoverJobResponse setBody(SubmitCoverJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCoverJobResponseBody getBody() {
        return this.body;
    }

}
