// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListContactFlowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContactFlowsResponseBody body;

    public static ListContactFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContactFlowsResponse self = new ListContactFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListContactFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContactFlowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContactFlowsResponse setBody(ListContactFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContactFlowsResponseBody getBody() {
        return this.body;
    }

}
