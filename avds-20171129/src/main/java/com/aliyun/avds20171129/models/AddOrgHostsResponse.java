// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddOrgHostsResponseBody body;

    public static AddOrgHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOrgHostsResponse self = new AddOrgHostsResponse();
        return TeaModel.build(map, self);
    }

    public AddOrgHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOrgHostsResponse setBody(AddOrgHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOrgHostsResponseBody getBody() {
        return this.body;
    }

}
