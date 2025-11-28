// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBizChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBizChainResponseBody body;

    public static ListBizChainResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBizChainResponse self = new ListBizChainResponse();
        return TeaModel.build(map, self);
    }

    public ListBizChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBizChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBizChainResponse setBody(ListBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBizChainResponseBody getBody() {
        return this.body;
    }

}
