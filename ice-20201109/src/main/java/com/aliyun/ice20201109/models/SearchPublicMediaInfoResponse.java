// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchPublicMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchPublicMediaInfoResponseBody body;

    public static SearchPublicMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchPublicMediaInfoResponse self = new SearchPublicMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public SearchPublicMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchPublicMediaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchPublicMediaInfoResponse setBody(SearchPublicMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchPublicMediaInfoResponseBody getBody() {
        return this.body;
    }

}
