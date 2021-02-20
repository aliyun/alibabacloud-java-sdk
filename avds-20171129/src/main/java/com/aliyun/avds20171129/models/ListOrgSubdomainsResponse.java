// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgSubdomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrgSubdomainsResponseBody body;

    public static ListOrgSubdomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrgSubdomainsResponse self = new ListOrgSubdomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrgSubdomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrgSubdomainsResponse setBody(ListOrgSubdomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrgSubdomainsResponseBody getBody() {
        return this.body;
    }

}
