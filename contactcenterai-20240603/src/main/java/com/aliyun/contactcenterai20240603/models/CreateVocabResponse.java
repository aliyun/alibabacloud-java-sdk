// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class CreateVocabResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVocabResponseBody body;

    public static CreateVocabResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVocabResponse self = new CreateVocabResponse();
        return TeaModel.build(map, self);
    }

    public CreateVocabResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVocabResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVocabResponse setBody(CreateVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVocabResponseBody getBody() {
        return this.body;
    }

}
