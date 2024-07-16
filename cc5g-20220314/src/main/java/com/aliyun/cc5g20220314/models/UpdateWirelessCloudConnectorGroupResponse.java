// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateWirelessCloudConnectorGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWirelessCloudConnectorGroupResponseBody body;

    public static UpdateWirelessCloudConnectorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWirelessCloudConnectorGroupResponse self = new UpdateWirelessCloudConnectorGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWirelessCloudConnectorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWirelessCloudConnectorGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWirelessCloudConnectorGroupResponse setBody(UpdateWirelessCloudConnectorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWirelessCloudConnectorGroupResponseBody getBody() {
        return this.body;
    }

}
