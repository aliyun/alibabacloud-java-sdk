// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListIdeNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIdeNodesResponseBody body;

    public static ListIdeNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIdeNodesResponse self = new ListIdeNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListIdeNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIdeNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIdeNodesResponse setBody(ListIdeNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIdeNodesResponseBody getBody() {
        return this.body;
    }

}
