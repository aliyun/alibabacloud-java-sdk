// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Id2MetaVerifyResponseBody body;

    public static Id2MetaVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaVerifyResponse self = new Id2MetaVerifyResponse();
        return TeaModel.build(map, self);
    }

    public Id2MetaVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Id2MetaVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Id2MetaVerifyResponse setBody(Id2MetaVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public Id2MetaVerifyResponseBody getBody() {
        return this.body;
    }

}
