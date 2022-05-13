// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowJobsResponseBody body;

    public static ListFlowJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowJobsResponse self = new ListFlowJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowJobsResponse setBody(ListFlowJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowJobsResponseBody getBody() {
        return this.body;
    }

}
