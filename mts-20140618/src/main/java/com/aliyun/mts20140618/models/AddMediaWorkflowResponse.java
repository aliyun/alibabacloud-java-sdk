// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddMediaWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMediaWorkflowResponse setBody(AddMediaWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMediaWorkflowResponseBody getBody() {
        return this.body;
    }

}
