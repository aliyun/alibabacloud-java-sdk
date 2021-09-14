// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class SearchImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchImageResponseBody body;

    public static SearchImageResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchImageResponse self = new SearchImageResponse();
        return TeaModel.build(map, self);
    }

    public SearchImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchImageResponse setBody(SearchImageResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchImageResponseBody getBody() {
        return this.body;
    }

}
