// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppsResponseBody body;

    public static DeleteAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppsResponse self = new DeleteAppsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppsResponse setBody(DeleteAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppsResponseBody getBody() {
        return this.body;
    }

}
