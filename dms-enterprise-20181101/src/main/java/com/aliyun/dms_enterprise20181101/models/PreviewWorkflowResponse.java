// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PreviewWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewWorkflowResponseBody body;

    public static PreviewWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewWorkflowResponse self = new PreviewWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public PreviewWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewWorkflowResponse setBody(PreviewWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewWorkflowResponseBody getBody() {
        return this.body;
    }

}
