// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllBizChainContractResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllBizChainContractResponseBody body;

    public static ListAllBizChainContractResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllBizChainContractResponse self = new ListAllBizChainContractResponse();
        return TeaModel.build(map, self);
    }

    public ListAllBizChainContractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllBizChainContractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllBizChainContractResponse setBody(ListAllBizChainContractResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllBizChainContractResponseBody getBody() {
        return this.body;
    }

}
