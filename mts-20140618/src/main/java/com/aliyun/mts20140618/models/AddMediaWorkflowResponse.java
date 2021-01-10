// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMediaWorkflowResponseBody body;

    public static AddMediaWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMediaWorkflowResponse self = new AddMediaWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public AddMediaWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMediaWorkflowResponse setBody(AddMediaWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMediaWorkflowResponseBody getBody() {
        return this.body;
    }

}
