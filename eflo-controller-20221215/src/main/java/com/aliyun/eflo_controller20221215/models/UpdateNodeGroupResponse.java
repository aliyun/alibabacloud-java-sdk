// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNodeGroupResponseBody body;

    public static UpdateNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeGroupResponse self = new UpdateNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNodeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNodeGroupResponse setBody(UpdateNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNodeGroupResponseBody getBody() {
        return this.body;
    }

}
