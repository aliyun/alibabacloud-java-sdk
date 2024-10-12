// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExperimentResponseBody body;

    public static ListExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentResponse self = new ListExperimentResponse();
        return TeaModel.build(map, self);
    }

    public ListExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExperimentResponse setBody(ListExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperimentResponseBody getBody() {
        return this.body;
    }

}
