// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListFlowAliasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlowAliasesResponseBody body;

    public static ListFlowAliasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowAliasesResponse self = new ListFlowAliasesResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowAliasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowAliasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowAliasesResponse setBody(ListFlowAliasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowAliasesResponseBody getBody() {
        return this.body;
    }

}
