// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AddServersToServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddServersToServerGroupResponseBody body;

    public static AddServersToServerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddServersToServerGroupResponse self = new AddServersToServerGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddServersToServerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddServersToServerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddServersToServerGroupResponse setBody(AddServersToServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddServersToServerGroupResponseBody getBody() {
        return this.body;
    }

}
