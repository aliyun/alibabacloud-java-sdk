// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeMiniAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListMcubeMiniAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcubeMiniAppsResponse setBody(ListMcubeMiniAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeMiniAppsResponseBody getBody() {
        return this.body;
    }

}
