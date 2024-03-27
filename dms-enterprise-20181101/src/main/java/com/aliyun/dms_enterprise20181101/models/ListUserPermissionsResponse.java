// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUserPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserPermissionsResponseBody body;

    public static ListUserPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserPermissionsResponse self = new ListUserPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserPermissionsResponse setBody(ListUserPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserPermissionsResponseBody getBody() {
        return this.body;
    }

}
