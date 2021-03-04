// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListAliasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAliasesResponseBody body;

    public static ListAliasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesResponse self = new ListAliasesResponse();
        return TeaModel.build(map, self);
    }

    public ListAliasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAliasesResponse setBody(ListAliasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAliasesResponseBody getBody() {
        return this.body;
    }

}
