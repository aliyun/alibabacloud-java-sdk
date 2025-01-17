// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TranslateSearchResponseBody body;

    public static TranslateSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateSearchResponse self = new TranslateSearchResponse();
        return TeaModel.build(map, self);
    }

    public TranslateSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranslateSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TranslateSearchResponse setBody(TranslateSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public TranslateSearchResponseBody getBody() {
        return this.body;
    }

}
