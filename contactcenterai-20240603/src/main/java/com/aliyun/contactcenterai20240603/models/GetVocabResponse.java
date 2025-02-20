// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class GetVocabResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVocabResponseBody body;

    public static GetVocabResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVocabResponse self = new GetVocabResponse();
        return TeaModel.build(map, self);
    }

    public GetVocabResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVocabResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVocabResponse setBody(GetVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVocabResponseBody getBody() {
        return this.body;
    }

}
