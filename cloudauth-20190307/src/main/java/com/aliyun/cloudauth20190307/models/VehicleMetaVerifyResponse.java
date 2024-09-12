// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleMetaVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VehicleMetaVerifyResponseBody body;

    public static VehicleMetaVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        VehicleMetaVerifyResponse self = new VehicleMetaVerifyResponse();
        return TeaModel.build(map, self);
    }

    public VehicleMetaVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VehicleMetaVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VehicleMetaVerifyResponse setBody(VehicleMetaVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public VehicleMetaVerifyResponseBody getBody() {
        return this.body;
    }

}
