// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListBindAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListBindAccountResponseBody body;

    public static ListBindAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBindAccountResponse self = new ListBindAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListBindAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBindAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBindAccountResponse setBody(ListBindAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBindAccountResponseBody getBody() {
        return this.body;
    }

}
