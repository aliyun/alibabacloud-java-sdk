// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DisableNetworkInterfaceQoSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableNetworkInterfaceQoSResponseBody body;

    public static DisableNetworkInterfaceQoSResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableNetworkInterfaceQoSResponse self = new DisableNetworkInterfaceQoSResponse();
        return TeaModel.build(map, self);
    }

    public DisableNetworkInterfaceQoSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableNetworkInterfaceQoSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableNetworkInterfaceQoSResponse setBody(DisableNetworkInterfaceQoSResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableNetworkInterfaceQoSResponseBody getBody() {
        return this.body;
    }

}
