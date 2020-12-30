// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class ElementSmartVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ElementSmartVerifyResponseBody body;

    public static ElementSmartVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ElementSmartVerifyResponse self = new ElementSmartVerifyResponse();
        return TeaModel.build(map, self);
    }

    public ElementSmartVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ElementSmartVerifyResponse setBody(ElementSmartVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public ElementSmartVerifyResponseBody getBody() {
        return this.body;
    }

}
