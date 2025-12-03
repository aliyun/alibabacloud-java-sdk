// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EnableNetworkInterfaceQoSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableNetworkInterfaceQoSResponseBody body;

    public static EnableNetworkInterfaceQoSResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableNetworkInterfaceQoSResponse self = new EnableNetworkInterfaceQoSResponse();
        return TeaModel.build(map, self);
    }

    public EnableNetworkInterfaceQoSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableNetworkInterfaceQoSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableNetworkInterfaceQoSResponse setBody(EnableNetworkInterfaceQoSResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableNetworkInterfaceQoSResponseBody getBody() {
        return this.body;
    }

}
