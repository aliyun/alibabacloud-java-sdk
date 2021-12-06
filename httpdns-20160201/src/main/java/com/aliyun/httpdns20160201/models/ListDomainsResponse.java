// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class ListDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDomainsResponseBody body;

    public static ListDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsResponse self = new ListDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDomainsResponse setBody(ListDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDomainsResponseBody getBody() {
        return this.body;
    }

}
