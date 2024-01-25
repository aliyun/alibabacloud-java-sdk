// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateBusinessGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBusinessGroupResponseBody body;

    public static UpdateBusinessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessGroupResponse self = new UpdateBusinessGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBusinessGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBusinessGroupResponse setBody(UpdateBusinessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBusinessGroupResponseBody getBody() {
        return this.body;
    }

}
