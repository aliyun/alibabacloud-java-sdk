// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListJoinedGroupsForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJoinedGroupsForUserResponseBody body;

    public static ListJoinedGroupsForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJoinedGroupsForUserResponse self = new ListJoinedGroupsForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListJoinedGroupsForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJoinedGroupsForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJoinedGroupsForUserResponse setBody(ListJoinedGroupsForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJoinedGroupsForUserResponseBody getBody() {
        return this.body;
    }

}
