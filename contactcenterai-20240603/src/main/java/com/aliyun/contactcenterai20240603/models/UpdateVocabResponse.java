// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class UpdateVocabResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVocabResponseBody body;

    public static UpdateVocabResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVocabResponse self = new UpdateVocabResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVocabResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVocabResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVocabResponse setBody(UpdateVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVocabResponseBody getBody() {
        return this.body;
    }

}
