// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class AssociateVSwitchWithIoTCloudConnectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateVSwitchWithIoTCloudConnectorResponseBody body;

    public static AssociateVSwitchWithIoTCloudConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateVSwitchWithIoTCloudConnectorResponse self = new AssociateVSwitchWithIoTCloudConnectorResponse();
        return TeaModel.build(map, self);
    }

    public AssociateVSwitchWithIoTCloudConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateVSwitchWithIoTCloudConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateVSwitchWithIoTCloudConnectorResponse setBody(AssociateVSwitchWithIoTCloudConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateVSwitchWithIoTCloudConnectorResponseBody getBody() {
        return this.body;
    }

}
