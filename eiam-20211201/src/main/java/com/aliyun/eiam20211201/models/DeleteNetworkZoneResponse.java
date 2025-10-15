// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteNetworkZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNetworkZoneResponseBody body;

    public static DeleteNetworkZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkZoneResponse self = new DeleteNetworkZoneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkZoneResponse setBody(DeleteNetworkZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkZoneResponseBody getBody() {
        return this.body;
    }

}
