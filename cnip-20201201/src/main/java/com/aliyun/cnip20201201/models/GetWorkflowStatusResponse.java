// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetWorkflowStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkflowStatusResponseBody body;

    public static GetWorkflowStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowStatusResponse self = new GetWorkflowStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowStatusResponse setBody(GetWorkflowStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowStatusResponseBody getBody() {
        return this.body;
    }

}
