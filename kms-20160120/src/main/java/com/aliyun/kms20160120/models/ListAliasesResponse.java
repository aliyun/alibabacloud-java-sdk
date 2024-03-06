// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListAliasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListAliasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAliasesResponse setBody(ListAliasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAliasesResponseBody getBody() {
        return this.body;
    }

}
