// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListHyperNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHyperNodesResponseBody body;

    public static ListHyperNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHyperNodesResponse self = new ListHyperNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListHyperNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHyperNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHyperNodesResponse setBody(ListHyperNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHyperNodesResponseBody getBody() {
        return this.body;
    }

}
