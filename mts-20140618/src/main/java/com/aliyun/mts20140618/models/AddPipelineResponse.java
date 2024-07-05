// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddPipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPipelineResponseBody body;

    public static AddPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPipelineResponse self = new AddPipelineResponse();
        return TeaModel.build(map, self);
    }

    public AddPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPipelineResponse setBody(AddPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPipelineResponseBody getBody() {
        return this.body;
    }

}
