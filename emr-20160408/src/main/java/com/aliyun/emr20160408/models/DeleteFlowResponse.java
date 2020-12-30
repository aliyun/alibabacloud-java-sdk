// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowResponseBody body;

    public static DeleteFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowResponse self = new DeleteFlowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowResponse setBody(DeleteFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowResponseBody getBody() {
        return this.body;
    }

}
