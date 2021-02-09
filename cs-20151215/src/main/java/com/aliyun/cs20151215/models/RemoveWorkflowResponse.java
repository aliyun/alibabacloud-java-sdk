// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static RemoveWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveWorkflowResponse self = new RemoveWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public RemoveWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
