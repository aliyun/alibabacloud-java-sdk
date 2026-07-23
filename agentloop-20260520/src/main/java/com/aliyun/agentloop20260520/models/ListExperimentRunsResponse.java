// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListExperimentRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExperimentRunsResponseBody body;

    public static ListExperimentRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentRunsResponse self = new ListExperimentRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListExperimentRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperimentRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExperimentRunsResponse setBody(ListExperimentRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperimentRunsResponseBody getBody() {
        return this.body;
    }

}
