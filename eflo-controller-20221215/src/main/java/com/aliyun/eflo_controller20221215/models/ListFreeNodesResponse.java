// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListFreeNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFreeNodesResponseBody body;

    public static ListFreeNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFreeNodesResponse self = new ListFreeNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListFreeNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFreeNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFreeNodesResponse setBody(ListFreeNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFreeNodesResponseBody getBody() {
        return this.body;
    }

}
