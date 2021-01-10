// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppsResponseBody body;

    public static ListAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponse self = new ListAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppsResponse setBody(ListAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppsResponseBody getBody() {
        return this.body;
    }

}
