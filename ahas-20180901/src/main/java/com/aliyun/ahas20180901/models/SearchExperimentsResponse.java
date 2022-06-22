// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SearchExperimentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchExperimentsResponseBody body;

    public static SearchExperimentsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchExperimentsResponse self = new SearchExperimentsResponse();
        return TeaModel.build(map, self);
    }

    public SearchExperimentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchExperimentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchExperimentsResponse setBody(SearchExperimentsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchExperimentsResponseBody getBody() {
        return this.body;
    }

}
