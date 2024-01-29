// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByAILabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchMediaByAILabelResponseBody body;

    public static SearchMediaByAILabelResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByAILabelResponse self = new SearchMediaByAILabelResponse();
        return TeaModel.build(map, self);
    }

    public SearchMediaByAILabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMediaByAILabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchMediaByAILabelResponse setBody(SearchMediaByAILabelResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMediaByAILabelResponseBody getBody() {
        return this.body;
    }

}
