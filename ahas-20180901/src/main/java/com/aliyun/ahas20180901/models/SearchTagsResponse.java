// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SearchTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchTagsResponseBody body;

    public static SearchTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTagsResponse self = new SearchTagsResponse();
        return TeaModel.build(map, self);
    }

    public SearchTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTagsResponse setBody(SearchTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTagsResponseBody getBody() {
        return this.body;
    }

}
