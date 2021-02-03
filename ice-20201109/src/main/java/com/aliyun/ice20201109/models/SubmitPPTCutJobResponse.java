// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitPPTCutJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitPPTCutJobResponseBody body;

    public static SubmitPPTCutJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPPTCutJobResponse self = new SubmitPPTCutJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPPTCutJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPPTCutJobResponse setBody(SubmitPPTCutJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPPTCutJobResponseBody getBody() {
        return this.body;
    }

}
