// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCdnServiceResponseBody body;

    public static ModifyCdnServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdnServiceResponse self = new ModifyCdnServiceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCdnServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCdnServiceResponse setBody(ModifyCdnServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCdnServiceResponseBody getBody() {
        return this.body;
    }

}
