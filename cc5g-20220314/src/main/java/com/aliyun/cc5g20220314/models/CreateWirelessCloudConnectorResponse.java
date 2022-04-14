// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateWirelessCloudConnectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWirelessCloudConnectorResponseBody body;

    public static CreateWirelessCloudConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWirelessCloudConnectorResponse self = new CreateWirelessCloudConnectorResponse();
        return TeaModel.build(map, self);
    }

    public CreateWirelessCloudConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWirelessCloudConnectorResponse setBody(CreateWirelessCloudConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWirelessCloudConnectorResponseBody getBody() {
        return this.body;
    }

}
