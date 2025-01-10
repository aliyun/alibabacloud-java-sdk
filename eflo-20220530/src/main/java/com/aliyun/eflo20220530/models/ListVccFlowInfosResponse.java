// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccFlowInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVccFlowInfosResponseBody body;

    public static ListVccFlowInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVccFlowInfosResponse self = new ListVccFlowInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListVccFlowInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVccFlowInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVccFlowInfosResponse setBody(ListVccFlowInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVccFlowInfosResponseBody getBody() {
        return this.body;
    }

}
