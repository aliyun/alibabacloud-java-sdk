// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListUserSerivceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserSerivceGroupsResponseBody body;

    public static ListUserSerivceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserSerivceGroupsResponse self = new ListUserSerivceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserSerivceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserSerivceGroupsResponse setBody(ListUserSerivceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserSerivceGroupsResponseBody getBody() {
        return this.body;
    }

}
