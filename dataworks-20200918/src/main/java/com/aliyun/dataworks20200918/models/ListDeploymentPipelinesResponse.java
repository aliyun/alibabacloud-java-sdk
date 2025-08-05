// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDeploymentPipelinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeploymentPipelinesResponseBody body;

    public static ListDeploymentPipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentPipelinesResponse self = new ListDeploymentPipelinesResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentPipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeploymentPipelinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeploymentPipelinesResponse setBody(ListDeploymentPipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeploymentPipelinesResponseBody getBody() {
        return this.body;
    }

}
