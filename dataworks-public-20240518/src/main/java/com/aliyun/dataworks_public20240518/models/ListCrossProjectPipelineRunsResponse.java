// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrossProjectPipelineRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCrossProjectPipelineRunsResponseBody body;

    public static ListCrossProjectPipelineRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCrossProjectPipelineRunsResponse self = new ListCrossProjectPipelineRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListCrossProjectPipelineRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCrossProjectPipelineRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCrossProjectPipelineRunsResponse setBody(ListCrossProjectPipelineRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCrossProjectPipelineRunsResponseBody getBody() {
        return this.body;
    }

}
