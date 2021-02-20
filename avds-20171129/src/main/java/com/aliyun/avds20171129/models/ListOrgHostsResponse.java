// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrgHostsResponseBody body;

    public static ListOrgHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrgHostsResponse self = new ListOrgHostsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrgHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrgHostsResponse setBody(ListOrgHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrgHostsResponseBody getBody() {
        return this.body;
    }

}
