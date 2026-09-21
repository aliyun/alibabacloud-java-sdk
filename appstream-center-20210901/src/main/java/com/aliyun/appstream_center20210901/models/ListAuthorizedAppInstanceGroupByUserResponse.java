// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedAppInstanceGroupByUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizedAppInstanceGroupByUserResponseBody body;

    public static ListAuthorizedAppInstanceGroupByUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAppInstanceGroupByUserResponse self = new ListAuthorizedAppInstanceGroupByUserResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAppInstanceGroupByUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedAppInstanceGroupByUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedAppInstanceGroupByUserResponse setBody(ListAuthorizedAppInstanceGroupByUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedAppInstanceGroupByUserResponseBody getBody() {
        return this.body;
    }

}
