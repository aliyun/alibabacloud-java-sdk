// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaDetailStandardVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Mobile3MetaDetailStandardVerifyResponseBody body;

    public static Mobile3MetaDetailStandardVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaDetailStandardVerifyResponse self = new Mobile3MetaDetailStandardVerifyResponse();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaDetailStandardVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Mobile3MetaDetailStandardVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Mobile3MetaDetailStandardVerifyResponse setBody(Mobile3MetaDetailStandardVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public Mobile3MetaDetailStandardVerifyResponseBody getBody() {
        return this.body;
    }

}
