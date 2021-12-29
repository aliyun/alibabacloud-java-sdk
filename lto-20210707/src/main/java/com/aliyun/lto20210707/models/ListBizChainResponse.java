// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBizChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListBizChainResponse setBody(ListBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBizChainResponseBody getBody() {
        return this.body;
    }

}
