// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableCloudAccountPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCloudAccountPrivilegeResponseBody body;

    public static DisableCloudAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCloudAccountPrivilegeResponse self = new DisableCloudAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public DisableCloudAccountPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCloudAccountPrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCloudAccountPrivilegeResponse setBody(DisableCloudAccountPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCloudAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

}
