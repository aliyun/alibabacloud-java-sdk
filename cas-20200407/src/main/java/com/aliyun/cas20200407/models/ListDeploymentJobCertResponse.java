// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeploymentJobCertResponseBody body;

    public static ListDeploymentJobCertResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentJobCertResponse self = new ListDeploymentJobCertResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentJobCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeploymentJobCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeploymentJobCertResponse setBody(ListDeploymentJobCertResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeploymentJobCertResponseBody getBody() {
        return this.body;
    }

}
