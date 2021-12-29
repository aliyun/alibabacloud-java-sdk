// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSAntChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListBaaSAntChainResponse setBody(ListBaaSAntChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaaSAntChainResponseBody getBody() {
        return this.body;
    }

}
