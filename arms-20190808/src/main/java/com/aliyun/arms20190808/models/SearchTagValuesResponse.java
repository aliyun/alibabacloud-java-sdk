// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTagValuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchTagValuesResponseBody body;

    public static SearchTagValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTagValuesResponse self = new SearchTagValuesResponse();
        return TeaModel.build(map, self);
    }

    public SearchTagValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTagValuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTagValuesResponse setBody(SearchTagValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTagValuesResponseBody getBody() {
        return this.body;
    }

}
