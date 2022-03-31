// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteTaskFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTaskFlowResponseBody body;

    public static DeleteTaskFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskFlowResponse self = new DeleteTaskFlowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTaskFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTaskFlowResponse setBody(DeleteTaskFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTaskFlowResponseBody getBody() {
        return this.body;
    }

}
