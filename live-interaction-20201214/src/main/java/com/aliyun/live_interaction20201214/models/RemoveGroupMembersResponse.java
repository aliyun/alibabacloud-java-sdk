// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveGroupMembersResponseBody body;

    public static RemoveGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupMembersResponse self = new RemoveGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public RemoveGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveGroupMembersResponse setBody(RemoveGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveGroupMembersResponseBody getBody() {
        return this.body;
    }

}
