// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateLogStoreConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLogStoreConfigResponseBody body;

    public static UpdateLogStoreConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogStoreConfigResponse self = new UpdateLogStoreConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLogStoreConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLogStoreConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLogStoreConfigResponse setBody(UpdateLogStoreConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLogStoreConfigResponseBody getBody() {
        return this.body;
    }

}
