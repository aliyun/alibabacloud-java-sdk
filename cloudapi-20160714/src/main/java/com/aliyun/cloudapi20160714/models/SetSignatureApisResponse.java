// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetSignatureApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetSignatureApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSignatureApisResponse setBody(SetSignatureApisResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSignatureApisResponseBody getBody() {
        return this.body;
    }

}
