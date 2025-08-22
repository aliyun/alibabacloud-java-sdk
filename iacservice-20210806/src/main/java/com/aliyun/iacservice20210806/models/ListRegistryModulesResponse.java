// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRegistryModulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRegistryModulesResponseBody body;

    public static ListRegistryModulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRegistryModulesResponse self = new ListRegistryModulesResponse();
        return TeaModel.build(map, self);
    }

    public ListRegistryModulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRegistryModulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRegistryModulesResponse setBody(ListRegistryModulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRegistryModulesResponseBody getBody() {
        return this.body;
    }

}
