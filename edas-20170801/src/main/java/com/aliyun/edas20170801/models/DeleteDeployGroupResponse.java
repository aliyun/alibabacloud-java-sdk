// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteDeployGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeployGroupResponseBody body;

    public static DeleteDeployGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeployGroupResponse self = new DeleteDeployGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeployGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeployGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeployGroupResponse setBody(DeleteDeployGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeployGroupResponseBody getBody() {
        return this.body;
    }

}
