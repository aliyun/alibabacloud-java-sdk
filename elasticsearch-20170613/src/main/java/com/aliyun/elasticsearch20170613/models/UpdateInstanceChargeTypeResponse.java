// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceChargeTypeResponseBody body;

    public static UpdateInstanceChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceChargeTypeResponse self = new UpdateInstanceChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceChargeTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceChargeTypeResponse setBody(UpdateInstanceChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceChargeTypeResponseBody getBody() {
        return this.body;
    }

}
