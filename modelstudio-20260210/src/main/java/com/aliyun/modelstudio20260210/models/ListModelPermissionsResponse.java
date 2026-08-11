// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListModelPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelPermissionsResponseBody body;

    public static ListModelPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelPermissionsResponse self = new ListModelPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListModelPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelPermissionsResponse setBody(ListModelPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelPermissionsResponseBody getBody() {
        return this.body;
    }

}
