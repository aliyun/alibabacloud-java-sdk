// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSAntChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBaaSAntChainResponseBody body;

    public static ListBaaSAntChainResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSAntChainResponse self = new ListBaaSAntChainResponse();
        return TeaModel.build(map, self);
    }

    public ListBaaSAntChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBaaSAntChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBaaSAntChainResponse setBody(ListBaaSAntChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaaSAntChainResponseBody getBody() {
        return this.body;
    }

}
