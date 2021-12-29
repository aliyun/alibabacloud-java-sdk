// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSAntChainConsortiumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBaaSAntChainConsortiumResponseBody body;

    public static ListBaaSAntChainConsortiumResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSAntChainConsortiumResponse self = new ListBaaSAntChainConsortiumResponse();
        return TeaModel.build(map, self);
    }

    public ListBaaSAntChainConsortiumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBaaSAntChainConsortiumResponse setBody(ListBaaSAntChainConsortiumResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaaSAntChainConsortiumResponseBody getBody() {
        return this.body;
    }

}
