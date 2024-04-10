// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChainResponseBody body;

    public static ListChainResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChainResponse self = new ListChainResponse();
        return TeaModel.build(map, self);
    }

    public ListChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChainResponse setBody(ListChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChainResponseBody getBody() {
        return this.body;
    }

}
