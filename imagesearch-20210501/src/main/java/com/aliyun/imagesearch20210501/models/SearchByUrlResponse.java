// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class SearchByUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchByUrlResponseBody body;

    public static SearchByUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchByUrlResponse self = new SearchByUrlResponse();
        return TeaModel.build(map, self);
    }

    public SearchByUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchByUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchByUrlResponse setBody(SearchByUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchByUrlResponseBody getBody() {
        return this.body;
    }

}
