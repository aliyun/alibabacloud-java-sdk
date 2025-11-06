// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListCubecardAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCubecardAppsResponseBody body;

    public static ListCubecardAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCubecardAppsResponse self = new ListCubecardAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListCubecardAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCubecardAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCubecardAppsResponse setBody(ListCubecardAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCubecardAppsResponseBody getBody() {
        return this.body;
    }

}
