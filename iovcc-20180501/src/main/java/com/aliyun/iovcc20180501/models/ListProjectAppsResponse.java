// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListProjectAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectAppsResponseBody body;

    public static ListProjectAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectAppsResponse self = new ListProjectAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectAppsResponse setBody(ListProjectAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectAppsResponseBody getBody() {
        return this.body;
    }

}
