// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddPipelineRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPipelineRelationsResponseBody body;

    public static AddPipelineRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPipelineRelationsResponse self = new AddPipelineRelationsResponse();
        return TeaModel.build(map, self);
    }

    public AddPipelineRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPipelineRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPipelineRelationsResponse setBody(AddPipelineRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPipelineRelationsResponseBody getBody() {
        return this.body;
    }

}
