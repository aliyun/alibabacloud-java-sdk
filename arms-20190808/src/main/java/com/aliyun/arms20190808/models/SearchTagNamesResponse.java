// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTagNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchTagNamesResponseBody body;

    public static SearchTagNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTagNamesResponse self = new SearchTagNamesResponse();
        return TeaModel.build(map, self);
    }

    public SearchTagNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTagNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTagNamesResponse setBody(SearchTagNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTagNamesResponseBody getBody() {
        return this.body;
    }

}
