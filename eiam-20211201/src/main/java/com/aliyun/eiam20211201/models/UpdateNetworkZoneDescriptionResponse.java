// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateNetworkZoneDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNetworkZoneDescriptionResponseBody body;

    public static UpdateNetworkZoneDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkZoneDescriptionResponse self = new UpdateNetworkZoneDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkZoneDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNetworkZoneDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNetworkZoneDescriptionResponse setBody(UpdateNetworkZoneDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNetworkZoneDescriptionResponseBody getBody() {
        return this.body;
    }

}
