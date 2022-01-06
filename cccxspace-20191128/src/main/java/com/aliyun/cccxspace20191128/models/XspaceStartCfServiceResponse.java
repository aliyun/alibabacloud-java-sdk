// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class XspaceStartCfServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceStartCfServiceResponseBody body;

    public static XspaceStartCfServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceStartCfServiceResponse self = new XspaceStartCfServiceResponse();
        return TeaModel.build(map, self);
    }

    public XspaceStartCfServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceStartCfServiceResponse setBody(XspaceStartCfServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceStartCfServiceResponseBody getBody() {
        return this.body;
    }

}
