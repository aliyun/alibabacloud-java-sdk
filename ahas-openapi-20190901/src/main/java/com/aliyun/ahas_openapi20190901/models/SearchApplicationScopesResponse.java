// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class SearchApplicationScopesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchApplicationScopesResponseBody body;

    public static SearchApplicationScopesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchApplicationScopesResponse self = new SearchApplicationScopesResponse();
        return TeaModel.build(map, self);
    }

    public SearchApplicationScopesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchApplicationScopesResponse setBody(SearchApplicationScopesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchApplicationScopesResponseBody getBody() {
        return this.body;
    }

}
