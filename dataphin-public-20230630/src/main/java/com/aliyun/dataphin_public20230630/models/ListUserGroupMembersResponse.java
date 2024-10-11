// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListUserGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserGroupMembersResponseBody body;

    public static ListUserGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupMembersResponse self = new ListUserGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListUserGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserGroupMembersResponse setBody(ListUserGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserGroupMembersResponseBody getBody() {
        return this.body;
    }

}
