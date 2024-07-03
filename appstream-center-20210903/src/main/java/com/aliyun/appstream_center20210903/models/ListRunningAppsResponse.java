// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class ListRunningAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRunningAppsResponseBody body;

    public static ListRunningAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRunningAppsResponse self = new ListRunningAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListRunningAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRunningAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRunningAppsResponse setBody(ListRunningAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRunningAppsResponseBody getBody() {
        return this.body;
    }

}
