// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetDRMLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDRMLicenseResponseBody body;

    public static GetDRMLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDRMLicenseResponse self = new GetDRMLicenseResponse();
        return TeaModel.build(map, self);
    }

    public GetDRMLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDRMLicenseResponse setBody(GetDRMLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDRMLicenseResponseBody getBody() {
        return this.body;
    }

}
