// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SetInstancesProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetInstancesProtectionResponseBody body;

    public static SetInstancesProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstancesProtectionResponse self = new SetInstancesProtectionResponse();
        return TeaModel.build(map, self);
    }

    public SetInstancesProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstancesProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetInstancesProtectionResponse setBody(SetInstancesProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstancesProtectionResponseBody getBody() {
        return this.body;
    }

}
