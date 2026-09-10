// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateMaintainWindowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMaintainWindowResponseBody body;

    public static UpdateMaintainWindowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaintainWindowResponse self = new UpdateMaintainWindowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMaintainWindowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMaintainWindowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMaintainWindowResponse setBody(UpdateMaintainWindowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMaintainWindowResponseBody getBody() {
        return this.body;
    }

}
