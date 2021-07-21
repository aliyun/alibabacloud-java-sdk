// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListAuthorizedResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorizedResourcesResponseBody body;

    public static ListAuthorizedResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedResourcesResponse self = new ListAuthorizedResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedResourcesResponse setBody(ListAuthorizedResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedResourcesResponseBody getBody() {
        return this.body;
    }

}
