// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeMiniAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMcubeMiniAppsResponseBody body;

    public static ListMcubeMiniAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniAppsResponse self = new ListMcubeMiniAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMcubeMiniAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcubeMiniAppsResponse setBody(ListMcubeMiniAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeMiniAppsResponseBody getBody() {
        return this.body;
    }

}
