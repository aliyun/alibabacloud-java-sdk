// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedInstancesForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizedInstancesForUserResponseBody body;

    public static ListAuthorizedInstancesForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedInstancesForUserResponse self = new ListAuthorizedInstancesForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedInstancesForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedInstancesForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedInstancesForUserResponse setBody(ListAuthorizedInstancesForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedInstancesForUserResponseBody getBody() {
        return this.body;
    }

}
