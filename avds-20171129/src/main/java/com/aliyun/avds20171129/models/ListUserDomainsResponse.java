// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserDomainsResponseBody body;

    public static ListUserDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserDomainsResponse self = new ListUserDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserDomainsResponse setBody(ListUserDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserDomainsResponseBody getBody() {
        return this.body;
    }

}
