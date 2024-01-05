// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetIgraphLabelLastBackflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIgraphLabelLastBackflowResponseBody body;

    public static GetIgraphLabelLastBackflowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIgraphLabelLastBackflowResponse self = new GetIgraphLabelLastBackflowResponse();
        return TeaModel.build(map, self);
    }

    public GetIgraphLabelLastBackflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIgraphLabelLastBackflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIgraphLabelLastBackflowResponse setBody(GetIgraphLabelLastBackflowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIgraphLabelLastBackflowResponseBody getBody() {
        return this.body;
    }

}
