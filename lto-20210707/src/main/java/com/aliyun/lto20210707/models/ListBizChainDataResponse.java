// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBizChainDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBizChainDataResponseBody body;

    public static ListBizChainDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBizChainDataResponse self = new ListBizChainDataResponse();
        return TeaModel.build(map, self);
    }

    public ListBizChainDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBizChainDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBizChainDataResponse setBody(ListBizChainDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBizChainDataResponseBody getBody() {
        return this.body;
    }

}
