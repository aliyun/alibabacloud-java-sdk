// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifySignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifySignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySignatureResponse setBody(ModifySignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySignatureResponseBody getBody() {
        return this.body;
    }

}
