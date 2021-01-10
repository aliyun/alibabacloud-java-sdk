// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveFaceUserFromUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RemoveFaceUserFromUserGroupResponse setBody(RemoveFaceUserFromUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveFaceUserFromUserGroupResponseBody getBody() {
        return this.body;
    }

}
