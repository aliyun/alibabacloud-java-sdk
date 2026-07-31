// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SearchSemanticViewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchSemanticViewsResponseBody body;

    public static SearchSemanticViewsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchSemanticViewsResponse self = new SearchSemanticViewsResponse();
        return TeaModel.build(map, self);
    }

    public SearchSemanticViewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchSemanticViewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchSemanticViewsResponse setBody(SearchSemanticViewsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchSemanticViewsResponseBody getBody() {
        return this.body;
    }

}
