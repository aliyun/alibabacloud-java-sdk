// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteTaskFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteTaskFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTaskFlowResponse setBody(DeleteTaskFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTaskFlowResponseBody getBody() {
        return this.body;
    }

}
