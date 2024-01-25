// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteSignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSignatureResponseBody body;

    public static DeleteSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSignatureResponse self = new DeleteSignatureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSignatureResponse setBody(DeleteSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSignatureResponseBody getBody() {
        return this.body;
    }

}
