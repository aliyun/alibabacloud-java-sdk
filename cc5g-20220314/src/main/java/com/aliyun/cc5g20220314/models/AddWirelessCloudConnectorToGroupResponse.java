// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class AddWirelessCloudConnectorToGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddWirelessCloudConnectorToGroupResponseBody body;

    public static AddWirelessCloudConnectorToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWirelessCloudConnectorToGroupResponse self = new AddWirelessCloudConnectorToGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddWirelessCloudConnectorToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWirelessCloudConnectorToGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWirelessCloudConnectorToGroupResponse setBody(AddWirelessCloudConnectorToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWirelessCloudConnectorToGroupResponseBody getBody() {
        return this.body;
    }

}
