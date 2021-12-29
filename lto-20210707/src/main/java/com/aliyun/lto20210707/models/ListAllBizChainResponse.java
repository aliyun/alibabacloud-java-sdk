// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllBizChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllBizChainResponseBody body;

    public static ListAllBizChainResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllBizChainResponse self = new ListAllBizChainResponse();
        return TeaModel.build(map, self);
    }

    public ListAllBizChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllBizChainResponse setBody(ListAllBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllBizChainResponseBody getBody() {
        return this.body;
    }

}
