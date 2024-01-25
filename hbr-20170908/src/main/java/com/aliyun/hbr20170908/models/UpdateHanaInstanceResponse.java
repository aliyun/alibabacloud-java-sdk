// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateHanaInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHanaInstanceResponseBody body;

    public static UpdateHanaInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHanaInstanceResponse self = new UpdateHanaInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHanaInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHanaInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHanaInstanceResponse setBody(UpdateHanaInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHanaInstanceResponseBody getBody() {
        return this.body;
    }

}
