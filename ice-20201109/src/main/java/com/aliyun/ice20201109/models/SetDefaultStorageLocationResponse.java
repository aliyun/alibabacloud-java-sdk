// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetDefaultStorageLocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultStorageLocationResponseBody body;

    public static SetDefaultStorageLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultStorageLocationResponse self = new SetDefaultStorageLocationResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultStorageLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultStorageLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultStorageLocationResponse setBody(SetDefaultStorageLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultStorageLocationResponseBody getBody() {
        return this.body;
    }

}
