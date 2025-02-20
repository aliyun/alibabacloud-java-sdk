// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class DeleteVocabResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVocabResponseBody body;

    public static DeleteVocabResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVocabResponse self = new DeleteVocabResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVocabResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVocabResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVocabResponse setBody(DeleteVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVocabResponseBody getBody() {
        return this.body;
    }

}
