// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class DeleteLdpsComputeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLdpsComputeGroupResponseBody body;

    public static DeleteLdpsComputeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLdpsComputeGroupResponse self = new DeleteLdpsComputeGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLdpsComputeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLdpsComputeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLdpsComputeGroupResponse setBody(DeleteLdpsComputeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLdpsComputeGroupResponseBody getBody() {
        return this.body;
    }

}
