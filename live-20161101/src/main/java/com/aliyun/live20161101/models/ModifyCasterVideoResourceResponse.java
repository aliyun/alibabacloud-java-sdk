// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterVideoResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCasterVideoResourceResponseBody body;

    public static ModifyCasterVideoResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterVideoResourceResponse self = new ModifyCasterVideoResourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCasterVideoResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCasterVideoResourceResponse setBody(ModifyCasterVideoResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCasterVideoResourceResponseBody getBody() {
        return this.body;
    }

}
