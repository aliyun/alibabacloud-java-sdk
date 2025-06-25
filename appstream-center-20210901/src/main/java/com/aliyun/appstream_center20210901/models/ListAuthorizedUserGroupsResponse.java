// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedUserGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizedUserGroupsResponseBody body;

    public static ListAuthorizedUserGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUserGroupsResponse self = new ListAuthorizedUserGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUserGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedUserGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedUserGroupsResponse setBody(ListAuthorizedUserGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedUserGroupsResponseBody getBody() {
        return this.body;
    }

}
