// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DissociateVSwitchFromIoTCloudConnectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DissociateVSwitchFromIoTCloudConnectorResponseBody body;

    public static DissociateVSwitchFromIoTCloudConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateVSwitchFromIoTCloudConnectorResponse self = new DissociateVSwitchFromIoTCloudConnectorResponse();
        return TeaModel.build(map, self);
    }

    public DissociateVSwitchFromIoTCloudConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateVSwitchFromIoTCloudConnectorResponse setBody(DissociateVSwitchFromIoTCloudConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateVSwitchFromIoTCloudConnectorResponseBody getBody() {
        return this.body;
    }

}
