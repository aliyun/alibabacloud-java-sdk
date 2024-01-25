// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetAccessPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAccessPermissionsResponseBody body;

    public static SetAccessPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccessPermissionsResponse self = new SetAccessPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public SetAccessPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccessPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAccessPermissionsResponse setBody(SetAccessPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccessPermissionsResponseBody getBody() {
        return this.body;
    }

}
