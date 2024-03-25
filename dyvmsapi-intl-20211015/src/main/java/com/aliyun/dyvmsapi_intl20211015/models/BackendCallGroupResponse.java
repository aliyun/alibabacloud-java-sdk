// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class BackendCallGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BackendCallGroupResponseBody body;

    public static BackendCallGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        BackendCallGroupResponse self = new BackendCallGroupResponse();
        return TeaModel.build(map, self);
    }

    public BackendCallGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BackendCallGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BackendCallGroupResponse setBody(BackendCallGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public BackendCallGroupResponseBody getBody() {
        return this.body;
    }

}
