// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListActiveAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListActiveAppsResponseBody body;

    public static ListActiveAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActiveAppsResponse self = new ListActiveAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListActiveAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActiveAppsResponse setBody(ListActiveAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActiveAppsResponseBody getBody() {
        return this.body;
    }

}
