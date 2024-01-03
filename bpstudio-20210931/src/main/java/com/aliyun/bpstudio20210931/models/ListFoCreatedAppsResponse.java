// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListFoCreatedAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFoCreatedAppsResponseBody body;

    public static ListFoCreatedAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFoCreatedAppsResponse self = new ListFoCreatedAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListFoCreatedAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFoCreatedAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFoCreatedAppsResponse setBody(ListFoCreatedAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFoCreatedAppsResponseBody getBody() {
        return this.body;
    }

}
