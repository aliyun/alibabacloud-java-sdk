// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListGlobalAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGlobalAppsResponseBody body;

    public static ListGlobalAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalAppsResponse self = new ListGlobalAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListGlobalAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGlobalAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGlobalAppsResponse setBody(ListGlobalAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGlobalAppsResponseBody getBody() {
        return this.body;
    }

}
