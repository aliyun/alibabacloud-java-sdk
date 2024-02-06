// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ResumeSingleCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeSingleCardResponseBody body;

    public static ResumeSingleCardResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeSingleCardResponse self = new ResumeSingleCardResponse();
        return TeaModel.build(map, self);
    }

    public ResumeSingleCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeSingleCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeSingleCardResponse setBody(ResumeSingleCardResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeSingleCardResponseBody getBody() {
        return this.body;
    }

}
