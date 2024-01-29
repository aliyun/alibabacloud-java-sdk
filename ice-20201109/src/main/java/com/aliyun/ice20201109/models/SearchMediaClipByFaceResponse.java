// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaClipByFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchMediaClipByFaceResponseBody body;

    public static SearchMediaClipByFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaClipByFaceResponse self = new SearchMediaClipByFaceResponse();
        return TeaModel.build(map, self);
    }

    public SearchMediaClipByFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMediaClipByFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchMediaClipByFaceResponse setBody(SearchMediaClipByFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMediaClipByFaceResponseBody getBody() {
        return this.body;
    }

}
