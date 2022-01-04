// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchResponseBody body;

    public static SearchResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchResponse self = new SearchResponse();
        return TeaModel.build(map, self);
    }

    public SearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchResponse setBody(SearchResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchResponseBody getBody() {
        return this.body;
    }

}
