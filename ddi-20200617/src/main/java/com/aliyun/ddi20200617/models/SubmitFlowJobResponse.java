// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class SubmitFlowJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public SubmitFlowJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitFlowJobResponse setBody(SubmitFlowJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitFlowJobResponseBody getBody() {
        return this.body;
    }

}
