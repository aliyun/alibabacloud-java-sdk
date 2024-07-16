// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateWirelessCloudConnectorGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWirelessCloudConnectorGroupResponseBody body;

    public static CreateWirelessCloudConnectorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWirelessCloudConnectorGroupResponse self = new CreateWirelessCloudConnectorGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateWirelessCloudConnectorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWirelessCloudConnectorGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWirelessCloudConnectorGroupResponse setBody(CreateWirelessCloudConnectorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWirelessCloudConnectorGroupResponseBody getBody() {
        return this.body;
    }

}
