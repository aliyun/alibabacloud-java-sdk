// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class XspaceAccessCfServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceAccessCfServiceResponseBody body;

    public static XspaceAccessCfServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceAccessCfServiceResponse self = new XspaceAccessCfServiceResponse();
        return TeaModel.build(map, self);
    }

    public XspaceAccessCfServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceAccessCfServiceResponse setBody(XspaceAccessCfServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceAccessCfServiceResponseBody getBody() {
        return this.body;
    }

}
