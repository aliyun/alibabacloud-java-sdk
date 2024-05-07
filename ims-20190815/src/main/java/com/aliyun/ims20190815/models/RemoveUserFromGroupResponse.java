// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveUserFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUserFromGroupResponseBody body;

    public static RemoveUserFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromGroupResponse self = new RemoveUserFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserFromGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUserFromGroupResponse setBody(RemoveUserFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserFromGroupResponseBody getBody() {
        return this.body;
    }

}
