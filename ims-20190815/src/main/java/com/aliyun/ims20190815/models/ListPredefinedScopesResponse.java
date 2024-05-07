// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListPredefinedScopesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPredefinedScopesResponseBody body;

    public static ListPredefinedScopesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPredefinedScopesResponse self = new ListPredefinedScopesResponse();
        return TeaModel.build(map, self);
    }

    public ListPredefinedScopesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPredefinedScopesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPredefinedScopesResponse setBody(ListPredefinedScopesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPredefinedScopesResponseBody getBody() {
        return this.body;
    }

}
