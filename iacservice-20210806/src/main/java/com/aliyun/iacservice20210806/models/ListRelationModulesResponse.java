// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRelationModulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRelationModulesResponseBody body;

    public static ListRelationModulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRelationModulesResponse self = new ListRelationModulesResponse();
        return TeaModel.build(map, self);
    }

    public ListRelationModulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRelationModulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRelationModulesResponse setBody(ListRelationModulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRelationModulesResponseBody getBody() {
        return this.body;
    }

}
