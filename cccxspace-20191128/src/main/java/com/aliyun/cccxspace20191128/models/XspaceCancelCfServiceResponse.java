// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class XspaceCancelCfServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public XspaceCancelCfServiceResponseBody body;

    public static XspaceCancelCfServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        XspaceCancelCfServiceResponse self = new XspaceCancelCfServiceResponse();
        return TeaModel.build(map, self);
    }

    public XspaceCancelCfServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public XspaceCancelCfServiceResponse setBody(XspaceCancelCfServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public XspaceCancelCfServiceResponseBody getBody() {
        return this.body;
    }

}
