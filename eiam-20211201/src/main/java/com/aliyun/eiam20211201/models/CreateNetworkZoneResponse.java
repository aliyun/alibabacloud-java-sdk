// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateNetworkZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNetworkZoneResponseBody body;

    public static CreateNetworkZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkZoneResponse self = new CreateNetworkZoneResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkZoneResponse setBody(CreateNetworkZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkZoneResponseBody getBody() {
        return this.body;
    }

}
