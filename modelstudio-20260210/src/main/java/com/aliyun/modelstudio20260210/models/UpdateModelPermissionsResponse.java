// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateModelPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelPermissionsResponseBody body;

    public static UpdateModelPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelPermissionsResponse self = new UpdateModelPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelPermissionsResponse setBody(UpdateModelPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelPermissionsResponseBody getBody() {
        return this.body;
    }

}
