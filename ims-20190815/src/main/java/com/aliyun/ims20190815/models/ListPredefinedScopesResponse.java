// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListPredefinedScopesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListPredefinedScopesResponse setBody(ListPredefinedScopesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPredefinedScopesResponseBody getBody() {
        return this.body;
    }

}
