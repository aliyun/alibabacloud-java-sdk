// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserProvisioningEventResponseBody body;

    public static GetUserProvisioningEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningEventResponse self = new GetUserProvisioningEventResponse();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserProvisioningEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserProvisioningEventResponse setBody(GetUserProvisioningEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserProvisioningEventResponseBody getBody() {
        return this.body;
    }

}
