// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrgDomainsResponseBody body;

    public static ListOrgDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrgDomainsResponse self = new ListOrgDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrgDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrgDomainsResponse setBody(ListOrgDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrgDomainsResponseBody getBody() {
        return this.body;
    }

}
