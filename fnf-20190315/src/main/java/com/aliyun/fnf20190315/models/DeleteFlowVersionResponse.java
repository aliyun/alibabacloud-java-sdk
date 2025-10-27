// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DeleteFlowVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFlowVersionResponseBody body;

    public static DeleteFlowVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowVersionResponse self = new DeleteFlowVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFlowVersionResponse setBody(DeleteFlowVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowVersionResponseBody getBody() {
        return this.body;
    }

}
