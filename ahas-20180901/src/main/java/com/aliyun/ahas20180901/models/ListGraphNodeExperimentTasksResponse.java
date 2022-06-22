// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListGraphNodeExperimentTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGraphNodeExperimentTasksResponseBody body;

    public static ListGraphNodeExperimentTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGraphNodeExperimentTasksResponse self = new ListGraphNodeExperimentTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListGraphNodeExperimentTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGraphNodeExperimentTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGraphNodeExperimentTasksResponse setBody(ListGraphNodeExperimentTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGraphNodeExperimentTasksResponseBody getBody() {
        return this.body;
    }

}
