// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeploymentJobResponseBody body;

    public static ListDeploymentJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentJobResponse self = new ListDeploymentJobResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeploymentJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeploymentJobResponse setBody(ListDeploymentJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeploymentJobResponseBody getBody() {
        return this.body;
    }

}
