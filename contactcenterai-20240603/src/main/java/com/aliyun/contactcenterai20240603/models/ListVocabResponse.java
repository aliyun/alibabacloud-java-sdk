// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class ListVocabResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVocabResponseBody body;

    public static ListVocabResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVocabResponse self = new ListVocabResponse();
        return TeaModel.build(map, self);
    }

    public ListVocabResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVocabResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVocabResponse setBody(ListVocabResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVocabResponseBody getBody() {
        return this.body;
    }

}
