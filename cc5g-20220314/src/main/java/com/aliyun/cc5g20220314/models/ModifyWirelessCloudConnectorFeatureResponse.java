// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ModifyWirelessCloudConnectorFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWirelessCloudConnectorFeatureResponseBody body;

    public static ModifyWirelessCloudConnectorFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWirelessCloudConnectorFeatureResponse self = new ModifyWirelessCloudConnectorFeatureResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWirelessCloudConnectorFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWirelessCloudConnectorFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWirelessCloudConnectorFeatureResponse setBody(ModifyWirelessCloudConnectorFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWirelessCloudConnectorFeatureResponseBody getBody() {
        return this.body;
    }

}
