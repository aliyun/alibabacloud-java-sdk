// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMappCenterAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMappCenterAppsResponseBody body;

    public static ListMappCenterAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMappCenterAppsResponse self = new ListMappCenterAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListMappCenterAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMappCenterAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMappCenterAppsResponse setBody(ListMappCenterAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMappCenterAppsResponseBody getBody() {
        return this.body;
    }

}
