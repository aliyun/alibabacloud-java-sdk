// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifySignatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySignatureResponseBody body;

    public static ModifySignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySignatureResponse self = new ModifySignatureResponse();
        return TeaModel.build(map, self);
    }

    public ModifySignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySignatureResponse setBody(ModifySignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySignatureResponseBody getBody() {
        return this.body;
    }

}
