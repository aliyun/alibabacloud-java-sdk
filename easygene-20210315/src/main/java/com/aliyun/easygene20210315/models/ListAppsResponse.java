// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppsResponse setBody(ListAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppsResponseBody getBody() {
        return this.body;
    }

}
