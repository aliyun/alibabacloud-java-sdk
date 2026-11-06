// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ActivateCloudAccountPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateCloudAccountPrivilegeResponseBody body;

    public static ActivateCloudAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateCloudAccountPrivilegeResponse self = new ActivateCloudAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public ActivateCloudAccountPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateCloudAccountPrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateCloudAccountPrivilegeResponse setBody(ActivateCloudAccountPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateCloudAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

}
