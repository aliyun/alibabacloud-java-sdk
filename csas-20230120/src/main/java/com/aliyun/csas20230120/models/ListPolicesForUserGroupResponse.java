// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPolicesForUserGroupResponseBody body;

    public static ListPolicesForUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForUserGroupResponse self = new ListPolicesForUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicesForUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPolicesForUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPolicesForUserGroupResponse setBody(ListPolicesForUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPolicesForUserGroupResponseBody getBody() {
        return this.body;
    }

}
