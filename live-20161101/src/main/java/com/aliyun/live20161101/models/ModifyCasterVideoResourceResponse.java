// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterVideoResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyCasterVideoResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCasterVideoResourceResponse setBody(ModifyCasterVideoResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCasterVideoResourceResponseBody getBody() {
        return this.body;
    }

}
