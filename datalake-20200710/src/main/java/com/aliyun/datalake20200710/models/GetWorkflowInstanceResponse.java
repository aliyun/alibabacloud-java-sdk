// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkflowInstanceResponseBody body;

    public static GetWorkflowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceResponse self = new GetWorkflowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowInstanceResponse setBody(GetWorkflowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowInstanceResponseBody getBody() {
        return this.body;
    }

}
