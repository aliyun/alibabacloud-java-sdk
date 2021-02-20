// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddOrgDomainsResponseBody body;

    public static AddOrgDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOrgDomainsResponse self = new AddOrgDomainsResponse();
        return TeaModel.build(map, self);
    }

    public AddOrgDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOrgDomainsResponse setBody(AddOrgDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOrgDomainsResponseBody getBody() {
        return this.body;
    }

}
