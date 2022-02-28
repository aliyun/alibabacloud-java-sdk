// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RegisterDiskGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterDiskGroupResponseBody body;

    public static RegisterDiskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterDiskGroupResponse self = new RegisterDiskGroupResponse();
        return TeaModel.build(map, self);
    }

    public RegisterDiskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterDiskGroupResponse setBody(RegisterDiskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterDiskGroupResponseBody getBody() {
        return this.body;
    }

}
