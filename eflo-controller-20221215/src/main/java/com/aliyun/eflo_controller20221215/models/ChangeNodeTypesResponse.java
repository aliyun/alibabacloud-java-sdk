// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ChangeNodeTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeNodeTypesResponseBody body;

    public static ChangeNodeTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeNodeTypesResponse self = new ChangeNodeTypesResponse();
        return TeaModel.build(map, self);
    }

    public ChangeNodeTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeNodeTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeNodeTypesResponse setBody(ChangeNodeTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeNodeTypesResponseBody getBody() {
        return this.body;
    }

}
