// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateIdpDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIdpDepartmentResponseBody body;

    public static UpdateIdpDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdpDepartmentResponse self = new UpdateIdpDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIdpDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIdpDepartmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIdpDepartmentResponse setBody(UpdateIdpDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIdpDepartmentResponseBody getBody() {
        return this.body;
    }

}
