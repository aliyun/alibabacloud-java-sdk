// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateWirelessCloudConnectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWirelessCloudConnectorResponseBody body;

    public static UpdateWirelessCloudConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWirelessCloudConnectorResponse self = new UpdateWirelessCloudConnectorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWirelessCloudConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWirelessCloudConnectorResponse setBody(UpdateWirelessCloudConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWirelessCloudConnectorResponseBody getBody() {
        return this.body;
    }

}
