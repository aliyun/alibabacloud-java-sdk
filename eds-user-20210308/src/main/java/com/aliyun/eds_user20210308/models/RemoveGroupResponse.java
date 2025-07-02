// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveGroupResponseBody body;

    public static RemoveGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupResponse self = new RemoveGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveGroupResponse setBody(RemoveGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveGroupResponseBody getBody() {
        return this.body;
    }

}
