// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeactivateCloudAccountPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeactivateCloudAccountPrivilegeResponseBody body;

    public static DeactivateCloudAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactivateCloudAccountPrivilegeResponse self = new DeactivateCloudAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public DeactivateCloudAccountPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactivateCloudAccountPrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeactivateCloudAccountPrivilegeResponse setBody(DeactivateCloudAccountPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactivateCloudAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

}
