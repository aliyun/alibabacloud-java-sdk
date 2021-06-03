// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAclsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAclsResponseBody body;

    public static ListAclsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAclsResponse self = new ListAclsResponse();
        return TeaModel.build(map, self);
    }

    public ListAclsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAclsResponse setBody(ListAclsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAclsResponseBody getBody() {
        return this.body;
    }

}
