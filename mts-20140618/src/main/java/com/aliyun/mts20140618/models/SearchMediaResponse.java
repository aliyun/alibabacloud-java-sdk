// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchMediaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchMediaResponseBody body;

    public static SearchMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaResponse self = new SearchMediaResponse();
        return TeaModel.build(map, self);
    }

    public SearchMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMediaResponse setBody(SearchMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMediaResponseBody getBody() {
        return this.body;
    }

}
