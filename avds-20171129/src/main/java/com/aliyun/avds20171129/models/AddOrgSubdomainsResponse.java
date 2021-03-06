// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgSubdomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddOrgSubdomainsResponseBody body;

    public static AddOrgSubdomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOrgSubdomainsResponse self = new AddOrgSubdomainsResponse();
        return TeaModel.build(map, self);
    }

    public AddOrgSubdomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOrgSubdomainsResponse setBody(AddOrgSubdomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOrgSubdomainsResponseBody getBody() {
        return this.body;
    }

}
