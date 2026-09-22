// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListPublishedAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishedAppsResponseBody body;

    public static ListPublishedAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAppsResponse self = new ListPublishedAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishedAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishedAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishedAppsResponse setBody(ListPublishedAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishedAppsResponseBody getBody() {
        return this.body;
    }

}
