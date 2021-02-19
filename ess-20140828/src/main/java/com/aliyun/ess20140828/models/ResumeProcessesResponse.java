// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ResumeProcessesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeProcessesResponseBody body;

    public static ResumeProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeProcessesResponse self = new ResumeProcessesResponse();
        return TeaModel.build(map, self);
    }

    public ResumeProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeProcessesResponse setBody(ResumeProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeProcessesResponseBody getBody() {
        return this.body;
    }

}
