// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VehicleMetaVerifyV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VehicleMetaVerifyV2ResponseBody body;

    public static VehicleMetaVerifyV2Response build(java.util.Map<String, ?> map) throws Exception {
        VehicleMetaVerifyV2Response self = new VehicleMetaVerifyV2Response();
        return TeaModel.build(map, self);
    }

    public VehicleMetaVerifyV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VehicleMetaVerifyV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VehicleMetaVerifyV2Response setBody(VehicleMetaVerifyV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public VehicleMetaVerifyV2ResponseBody getBody() {
        return this.body;
    }

}
