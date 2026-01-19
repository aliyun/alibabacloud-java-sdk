// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudAccountRolesResponseBody body;

    public static ListCloudAccountRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountRolesResponse self = new ListCloudAccountRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudAccountRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudAccountRolesResponse setBody(ListCloudAccountRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudAccountRolesResponseBody getBody() {
        return this.body;
    }

}
