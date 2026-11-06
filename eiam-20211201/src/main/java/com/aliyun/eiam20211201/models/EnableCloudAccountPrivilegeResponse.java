// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableCloudAccountPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCloudAccountPrivilegeResponseBody body;

    public static EnableCloudAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCloudAccountPrivilegeResponse self = new EnableCloudAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public EnableCloudAccountPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCloudAccountPrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCloudAccountPrivilegeResponse setBody(EnableCloudAccountPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCloudAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

}
