// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteSwimmingLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSwimmingLaneGroupResponseBody body;

    public static DeleteSwimmingLaneGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimmingLaneGroupResponse self = new DeleteSwimmingLaneGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSwimmingLaneGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSwimmingLaneGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSwimmingLaneGroupResponse setBody(DeleteSwimmingLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

}
