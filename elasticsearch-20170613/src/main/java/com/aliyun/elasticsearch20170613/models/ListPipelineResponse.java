// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPipelineResponseBody body;

    public static ListPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineResponse self = new ListPipelineResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineResponse setBody(ListPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineResponseBody getBody() {
        return this.body;
    }

}
