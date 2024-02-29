// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInnerNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInnerNodesResponseBody body;

    public static ListInnerNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInnerNodesResponse self = new ListInnerNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListInnerNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInnerNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInnerNodesResponse setBody(ListInnerNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInnerNodesResponseBody getBody() {
        return this.body;
    }

}
