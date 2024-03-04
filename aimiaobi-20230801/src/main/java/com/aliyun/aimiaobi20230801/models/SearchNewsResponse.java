// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SearchNewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchNewsResponseBody body;

    public static SearchNewsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchNewsResponse self = new SearchNewsResponse();
        return TeaModel.build(map, self);
    }

    public SearchNewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchNewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchNewsResponse setBody(SearchNewsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchNewsResponseBody getBody() {
        return this.body;
    }

}
