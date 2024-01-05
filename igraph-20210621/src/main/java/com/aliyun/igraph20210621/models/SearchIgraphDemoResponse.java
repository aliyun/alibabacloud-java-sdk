// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class SearchIgraphDemoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchIgraphDemoResponseBody body;

    public static SearchIgraphDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchIgraphDemoResponse self = new SearchIgraphDemoResponse();
        return TeaModel.build(map, self);
    }

    public SearchIgraphDemoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchIgraphDemoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchIgraphDemoResponse setBody(SearchIgraphDemoResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchIgraphDemoResponseBody getBody() {
        return this.body;
    }

}
