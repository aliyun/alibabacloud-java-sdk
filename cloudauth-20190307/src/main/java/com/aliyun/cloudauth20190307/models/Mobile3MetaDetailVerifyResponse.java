// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaDetailVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Mobile3MetaDetailVerifyResponseBody body;

    public static Mobile3MetaDetailVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaDetailVerifyResponse self = new Mobile3MetaDetailVerifyResponse();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaDetailVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Mobile3MetaDetailVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Mobile3MetaDetailVerifyResponse setBody(Mobile3MetaDetailVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public Mobile3MetaDetailVerifyResponseBody getBody() {
        return this.body;
    }

}
