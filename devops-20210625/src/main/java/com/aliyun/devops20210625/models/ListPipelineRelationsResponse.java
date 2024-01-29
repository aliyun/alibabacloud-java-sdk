// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPipelineRelationsResponseBody body;

    public static ListPipelineRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRelationsResponse self = new ListPipelineRelationsResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineRelationsResponse setBody(ListPipelineRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineRelationsResponseBody getBody() {
        return this.body;
    }

}
