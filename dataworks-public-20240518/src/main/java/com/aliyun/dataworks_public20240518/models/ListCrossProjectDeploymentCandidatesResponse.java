// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrossProjectDeploymentCandidatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCrossProjectDeploymentCandidatesResponseBody body;

    public static ListCrossProjectDeploymentCandidatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCrossProjectDeploymentCandidatesResponse self = new ListCrossProjectDeploymentCandidatesResponse();
        return TeaModel.build(map, self);
    }

    public ListCrossProjectDeploymentCandidatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCrossProjectDeploymentCandidatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCrossProjectDeploymentCandidatesResponse setBody(ListCrossProjectDeploymentCandidatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCrossProjectDeploymentCandidatesResponseBody getBody() {
        return this.body;
    }

}
