// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ListJobStepResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobStepResponseBody body;

    public static ListJobStepResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobStepResponse self = new ListJobStepResponse();
        return TeaModel.build(map, self);
    }

    public ListJobStepResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobStepResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobStepResponse setBody(ListJobStepResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobStepResponseBody getBody() {
        return this.body;
    }

}
