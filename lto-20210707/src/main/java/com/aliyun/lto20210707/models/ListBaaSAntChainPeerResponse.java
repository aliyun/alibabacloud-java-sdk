// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSAntChainPeerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBaaSAntChainPeerResponseBody body;

    public static ListBaaSAntChainPeerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSAntChainPeerResponse self = new ListBaaSAntChainPeerResponse();
        return TeaModel.build(map, self);
    }

    public ListBaaSAntChainPeerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBaaSAntChainPeerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBaaSAntChainPeerResponse setBody(ListBaaSAntChainPeerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaaSAntChainPeerResponseBody getBody() {
        return this.body;
    }

}
