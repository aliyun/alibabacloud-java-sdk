// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteFlowTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowTagResponseBody body;

    public static DeleteFlowTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowTagResponse self = new DeleteFlowTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowTagResponse setBody(DeleteFlowTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowTagResponseBody getBody() {
        return this.body;
    }

}
