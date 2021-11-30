// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListChainResponse setBody(ListChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChainResponseBody getBody() {
        return this.body;
    }

}
