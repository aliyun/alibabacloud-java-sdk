// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class SearchFaqResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchFaqResponseBody body;

    public static SearchFaqResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFaqResponse self = new SearchFaqResponse();
        return TeaModel.build(map, self);
    }

    public SearchFaqResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchFaqResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchFaqResponse setBody(SearchFaqResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchFaqResponseBody getBody() {
        return this.body;
    }

}
