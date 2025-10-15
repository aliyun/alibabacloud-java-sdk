// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateNetworkZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNetworkZoneResponseBody body;

    public static UpdateNetworkZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkZoneResponse self = new UpdateNetworkZoneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNetworkZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNetworkZoneResponse setBody(UpdateNetworkZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNetworkZoneResponseBody getBody() {
        return this.body;
    }

}
