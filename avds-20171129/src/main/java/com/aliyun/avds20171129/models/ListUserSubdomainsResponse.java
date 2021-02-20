// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserSubdomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserSubdomainsResponseBody body;

    public static ListUserSubdomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserSubdomainsResponse self = new ListUserSubdomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserSubdomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserSubdomainsResponse setBody(ListUserSubdomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserSubdomainsResponseBody getBody() {
        return this.body;
    }

}
