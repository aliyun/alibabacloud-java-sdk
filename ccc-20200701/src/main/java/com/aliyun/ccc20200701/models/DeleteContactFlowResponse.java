// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteContactFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContactFlowResponseBody body;

    public static DeleteContactFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactFlowResponse self = new DeleteContactFlowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContactFlowResponse setBody(DeleteContactFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactFlowResponseBody getBody() {
        return this.body;
    }

}
