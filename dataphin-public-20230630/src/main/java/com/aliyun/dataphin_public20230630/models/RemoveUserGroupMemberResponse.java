// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveUserGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUserGroupMemberResponseBody body;

    public static RemoveUserGroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserGroupMemberResponse self = new RemoveUserGroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserGroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserGroupMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUserGroupMemberResponse setBody(RemoveUserGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserGroupMemberResponseBody getBody() {
        return this.body;
    }

}
