// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RenewCloudPhoneNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewCloudPhoneNodesResponseBody body;

    public static RenewCloudPhoneNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewCloudPhoneNodesResponse self = new RenewCloudPhoneNodesResponse();
        return TeaModel.build(map, self);
    }

    public RenewCloudPhoneNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewCloudPhoneNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewCloudPhoneNodesResponse setBody(RenewCloudPhoneNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewCloudPhoneNodesResponseBody getBody() {
        return this.body;
    }

}
