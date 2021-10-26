// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetSignatureApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetSignatureApisResponseBody body;

    public static SetSignatureApisResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSignatureApisResponse self = new SetSignatureApisResponse();
        return TeaModel.build(map, self);
    }

    public SetSignatureApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSignatureApisResponse setBody(SetSignatureApisResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSignatureApisResponseBody getBody() {
        return this.body;
    }

}
