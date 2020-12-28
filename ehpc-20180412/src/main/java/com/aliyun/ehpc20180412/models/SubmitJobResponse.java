// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitJobResponseBody body;

    public static SubmitJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobResponse self = new SubmitJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitJobResponse setBody(SubmitJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitJobResponseBody getBody() {
        return this.body;
    }

}
