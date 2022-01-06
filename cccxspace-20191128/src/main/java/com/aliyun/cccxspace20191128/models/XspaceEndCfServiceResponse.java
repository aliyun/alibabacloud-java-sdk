// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class XspaceEndCfServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceEndCfServiceResponseBody body;

    public static XspaceEndCfServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceEndCfServiceResponse self = new XspaceEndCfServiceResponse();
        return TeaModel.build(map, self);
    }

    public XspaceEndCfServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceEndCfServiceResponse setBody(XspaceEndCfServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceEndCfServiceResponseBody getBody() {
        return this.body;
    }

}
