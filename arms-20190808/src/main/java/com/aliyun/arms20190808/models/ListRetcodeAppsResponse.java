// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListRetcodeAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRetcodeAppsResponseBody body;

    public static ListRetcodeAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRetcodeAppsResponse self = new ListRetcodeAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListRetcodeAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRetcodeAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRetcodeAppsResponse setBody(ListRetcodeAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRetcodeAppsResponseBody getBody() {
        return this.body;
    }

}
