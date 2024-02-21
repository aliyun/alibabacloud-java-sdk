// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineIdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPipelineIdsResponseBody body;

    public static ListPipelineIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineIdsResponse self = new ListPipelineIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineIdsResponse setBody(ListPipelineIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineIdsResponseBody getBody() {
        return this.body;
    }

}
