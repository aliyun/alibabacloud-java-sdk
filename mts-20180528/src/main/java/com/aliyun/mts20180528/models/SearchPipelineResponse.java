// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class SearchPipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchPipelineResponseBody body;

    public static SearchPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchPipelineResponse self = new SearchPipelineResponse();
        return TeaModel.build(map, self);
    }

    public SearchPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchPipelineResponse setBody(SearchPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchPipelineResponseBody getBody() {
        return this.body;
    }

}
