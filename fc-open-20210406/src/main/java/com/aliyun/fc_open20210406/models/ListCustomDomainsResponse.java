// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListCustomDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCustomDomainsResponseBody body;

    public static ListCustomDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainsResponse self = new ListCustomDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomDomainsResponse setBody(ListCustomDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomDomainsResponseBody getBody() {
        return this.body;
    }

}
