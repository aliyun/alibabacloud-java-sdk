// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id3MetaVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Id3MetaVerifyResponseBody body;

    public static Id3MetaVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        Id3MetaVerifyResponse self = new Id3MetaVerifyResponse();
        return TeaModel.build(map, self);
    }

    public Id3MetaVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Id3MetaVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Id3MetaVerifyResponse setBody(Id3MetaVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public Id3MetaVerifyResponseBody getBody() {
        return this.body;
    }

}
