// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class XspaceQueryStatusCfServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceQueryStatusCfServiceResponseBody body;

    public static XspaceQueryStatusCfServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceQueryStatusCfServiceResponse self = new XspaceQueryStatusCfServiceResponse();
        return TeaModel.build(map, self);
    }

    public XspaceQueryStatusCfServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceQueryStatusCfServiceResponse setBody(XspaceQueryStatusCfServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceQueryStatusCfServiceResponseBody getBody() {
        return this.body;
    }

}
