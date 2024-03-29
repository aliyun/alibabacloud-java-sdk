// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemEstimateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkitemEstimateResponseBody body;

    public static ListWorkitemEstimateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkitemEstimateResponse self = new ListWorkitemEstimateResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkitemEstimateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkitemEstimateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkitemEstimateResponse setBody(ListWorkitemEstimateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkitemEstimateResponseBody getBody() {
        return this.body;
    }

}
