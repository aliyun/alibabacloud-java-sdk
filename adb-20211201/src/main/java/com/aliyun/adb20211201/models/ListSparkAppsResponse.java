// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSparkAppsResponseBody body;

    public static ListSparkAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSparkAppsResponse self = new ListSparkAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListSparkAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSparkAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSparkAppsResponse setBody(ListSparkAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSparkAppsResponseBody getBody() {
        return this.body;
    }

}
