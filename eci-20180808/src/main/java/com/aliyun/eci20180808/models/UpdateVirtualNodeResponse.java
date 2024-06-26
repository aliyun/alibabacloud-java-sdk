// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateVirtualNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVirtualNodeResponseBody body;

    public static UpdateVirtualNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualNodeResponse self = new UpdateVirtualNodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVirtualNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVirtualNodeResponse setBody(UpdateVirtualNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVirtualNodeResponseBody getBody() {
        return this.body;
    }

}
