// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class SubmitFlowJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitFlowJobResponseBody body;

    public static SubmitFlowJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitFlowJobResponse self = new SubmitFlowJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitFlowJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitFlowJobResponse setBody(SubmitFlowJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFlowJobResponseBody getBody() {
        return this.body;
    }

}
