// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveSignatureApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveSignatureApisResponseBody body;

    public static RemoveSignatureApisResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSignatureApisResponse self = new RemoveSignatureApisResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSignatureApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSignatureApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSignatureApisResponse setBody(RemoveSignatureApisResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSignatureApisResponseBody getBody() {
        return this.body;
    }

}
