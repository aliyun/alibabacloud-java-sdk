// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteWirelessCloudConnectorGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWirelessCloudConnectorGroupResponseBody body;

    public static DeleteWirelessCloudConnectorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWirelessCloudConnectorGroupResponse self = new DeleteWirelessCloudConnectorGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWirelessCloudConnectorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWirelessCloudConnectorGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWirelessCloudConnectorGroupResponse setBody(DeleteWirelessCloudConnectorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWirelessCloudConnectorGroupResponseBody getBody() {
        return this.body;
    }

}
