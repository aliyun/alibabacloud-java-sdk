// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class VrUserCreateScanUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VrUserCreateScanUserResponseBody body;

    public static VrUserCreateScanUserResponse build(java.util.Map<String, ?> map) throws Exception {
        VrUserCreateScanUserResponse self = new VrUserCreateScanUserResponse();
        return TeaModel.build(map, self);
    }

    public VrUserCreateScanUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VrUserCreateScanUserResponse setBody(VrUserCreateScanUserResponseBody body) {
        this.body = body;
        return this;
    }
    public VrUserCreateScanUserResponseBody getBody() {
        return this.body;
    }

}
