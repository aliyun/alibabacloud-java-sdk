// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListExperimentPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExperimentPlansResponseBody body;

    public static ListExperimentPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentPlansResponse self = new ListExperimentPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListExperimentPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperimentPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExperimentPlansResponse setBody(ListExperimentPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperimentPlansResponseBody getBody() {
        return this.body;
    }

}
