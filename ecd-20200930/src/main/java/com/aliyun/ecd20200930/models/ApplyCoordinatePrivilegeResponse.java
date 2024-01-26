// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApplyCoordinatePrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyCoordinatePrivilegeResponseBody body;

    public static ApplyCoordinatePrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinatePrivilegeResponse self = new ApplyCoordinatePrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinatePrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyCoordinatePrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyCoordinatePrivilegeResponse setBody(ApplyCoordinatePrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyCoordinatePrivilegeResponseBody getBody() {
        return this.body;
    }

}
