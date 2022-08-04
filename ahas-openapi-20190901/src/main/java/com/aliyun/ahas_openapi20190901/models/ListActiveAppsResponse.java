// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListActiveAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListActiveAppsResponseBody body;

    public static ListActiveAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActiveAppsResponse self = new ListActiveAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListActiveAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActiveAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListActiveAppsResponse setBody(ListActiveAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActiveAppsResponseBody getBody() {
        return this.body;
    }

}
