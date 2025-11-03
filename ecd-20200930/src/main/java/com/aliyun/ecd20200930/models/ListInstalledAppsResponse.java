// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListInstalledAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstalledAppsResponseBody body;

    public static ListInstalledAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstalledAppsResponse self = new ListInstalledAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstalledAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstalledAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstalledAppsResponse setBody(ListInstalledAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstalledAppsResponseBody getBody() {
        return this.body;
    }

}
