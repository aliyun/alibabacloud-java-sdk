// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowProjectsResponseBody body;

    public static ListFlowProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowProjectsResponse self = new ListFlowProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowProjectsResponse setBody(ListFlowProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowProjectsResponseBody getBody() {
        return this.body;
    }

}
