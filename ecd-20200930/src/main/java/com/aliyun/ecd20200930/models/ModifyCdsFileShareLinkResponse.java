// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCdsFileShareLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCdsFileShareLinkResponseBody body;

    public static ModifyCdsFileShareLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdsFileShareLinkResponse self = new ModifyCdsFileShareLinkResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCdsFileShareLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCdsFileShareLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCdsFileShareLinkResponse setBody(ModifyCdsFileShareLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCdsFileShareLinkResponseBody getBody() {
        return this.body;
    }

}
