// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class RemoveWirelessCloudConnectorFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveWirelessCloudConnectorFromGroupResponseBody body;

    public static RemoveWirelessCloudConnectorFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveWirelessCloudConnectorFromGroupResponse self = new RemoveWirelessCloudConnectorFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveWirelessCloudConnectorFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveWirelessCloudConnectorFromGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveWirelessCloudConnectorFromGroupResponse setBody(RemoveWirelessCloudConnectorFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveWirelessCloudConnectorFromGroupResponseBody getBody() {
        return this.body;
    }

}
