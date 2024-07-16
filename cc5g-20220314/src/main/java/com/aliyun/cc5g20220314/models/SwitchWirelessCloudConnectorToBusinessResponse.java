// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class SwitchWirelessCloudConnectorToBusinessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchWirelessCloudConnectorToBusinessResponseBody body;

    public static SwitchWirelessCloudConnectorToBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchWirelessCloudConnectorToBusinessResponse self = new SwitchWirelessCloudConnectorToBusinessResponse();
        return TeaModel.build(map, self);
    }

    public SwitchWirelessCloudConnectorToBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchWirelessCloudConnectorToBusinessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchWirelessCloudConnectorToBusinessResponse setBody(SwitchWirelessCloudConnectorToBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchWirelessCloudConnectorToBusinessResponseBody getBody() {
        return this.body;
    }

}
