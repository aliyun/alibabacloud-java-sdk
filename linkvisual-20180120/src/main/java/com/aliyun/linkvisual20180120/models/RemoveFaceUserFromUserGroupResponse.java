// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveFaceUserFromUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveFaceUserFromUserGroupResponseBody body;

    public static RemoveFaceUserFromUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveFaceUserFromUserGroupResponse self = new RemoveFaceUserFromUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveFaceUserFromUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveFaceUserFromUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveFaceUserFromUserGroupResponse setBody(RemoveFaceUserFromUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveFaceUserFromUserGroupResponseBody getBody() {
        return this.body;
    }

}
