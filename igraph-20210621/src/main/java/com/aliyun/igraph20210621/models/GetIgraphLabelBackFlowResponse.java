// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetIgraphLabelBackFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIgraphLabelBackFlowResponseBody body;

    public static GetIgraphLabelBackFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIgraphLabelBackFlowResponse self = new GetIgraphLabelBackFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetIgraphLabelBackFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIgraphLabelBackFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIgraphLabelBackFlowResponse setBody(GetIgraphLabelBackFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIgraphLabelBackFlowResponseBody getBody() {
        return this.body;
    }

}
