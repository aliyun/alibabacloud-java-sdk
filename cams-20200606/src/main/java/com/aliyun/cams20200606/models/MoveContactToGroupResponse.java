// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class MoveContactToGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveContactToGroupResponseBody body;

    public static MoveContactToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveContactToGroupResponse self = new MoveContactToGroupResponse();
        return TeaModel.build(map, self);
    }

    public MoveContactToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveContactToGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveContactToGroupResponse setBody(MoveContactToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveContactToGroupResponseBody getBody() {
        return this.body;
    }

}
