// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchMediaByFaceResponseBody body;

    public static SearchMediaByFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByFaceResponse self = new SearchMediaByFaceResponse();
        return TeaModel.build(map, self);
    }

    public SearchMediaByFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMediaByFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchMediaByFaceResponse setBody(SearchMediaByFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMediaByFaceResponseBody getBody() {
        return this.body;
    }

}
