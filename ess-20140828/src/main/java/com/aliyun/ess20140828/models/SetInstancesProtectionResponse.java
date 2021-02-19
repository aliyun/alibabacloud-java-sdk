// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class SetInstancesProtectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetInstancesProtectionResponse setBody(SetInstancesProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstancesProtectionResponseBody getBody() {
        return this.body;
    }

}
