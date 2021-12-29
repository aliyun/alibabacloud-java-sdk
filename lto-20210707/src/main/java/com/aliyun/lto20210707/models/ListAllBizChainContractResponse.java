// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllBizChainContractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListAllBizChainContractResponse setBody(ListAllBizChainContractResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllBizChainContractResponseBody getBody() {
        return this.body;
    }

}
