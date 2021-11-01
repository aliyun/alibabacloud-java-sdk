// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DisableVirtualMFAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableVirtualMFAResponseBody body;

    public static DisableVirtualMFAResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableVirtualMFAResponse self = new DisableVirtualMFAResponse();
        return TeaModel.build(map, self);
    }

    public DisableVirtualMFAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableVirtualMFAResponse setBody(DisableVirtualMFAResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableVirtualMFAResponseBody getBody() {
        return this.body;
    }

}
