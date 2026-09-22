// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedAppsByUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizedAppsByUserResponseBody body;

    public static ListAuthorizedAppsByUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAppsByUserResponse self = new ListAuthorizedAppsByUserResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAppsByUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedAppsByUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedAppsByUserResponse setBody(ListAuthorizedAppsByUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedAppsByUserResponseBody getBody() {
        return this.body;
    }

}
