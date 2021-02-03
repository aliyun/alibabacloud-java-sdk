// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSmartJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSmartJobResponseBody body;

    public static SubmitSmartJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartJobResponse self = new SubmitSmartJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSmartJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSmartJobResponse setBody(SubmitSmartJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSmartJobResponseBody getBody() {
        return this.body;
    }

}
