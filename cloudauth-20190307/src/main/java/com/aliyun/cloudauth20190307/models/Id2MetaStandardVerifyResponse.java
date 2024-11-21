// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaStandardVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Id2MetaStandardVerifyResponseBody body;

    public static Id2MetaStandardVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaStandardVerifyResponse self = new Id2MetaStandardVerifyResponse();
        return TeaModel.build(map, self);
    }

    public Id2MetaStandardVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Id2MetaStandardVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Id2MetaStandardVerifyResponse setBody(Id2MetaStandardVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public Id2MetaStandardVerifyResponseBody getBody() {
        return this.body;
    }

}
