// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstanceUserPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceUserPermissionsResponseBody body;

    public static ListInstanceUserPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceUserPermissionsResponse self = new ListInstanceUserPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceUserPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceUserPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceUserPermissionsResponse setBody(ListInstanceUserPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceUserPermissionsResponseBody getBody() {
        return this.body;
    }

}
