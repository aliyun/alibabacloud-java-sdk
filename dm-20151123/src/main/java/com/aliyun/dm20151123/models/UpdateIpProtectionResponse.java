// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class UpdateIpProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIpProtectionResponseBody body;

    public static UpdateIpProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpProtectionResponse self = new UpdateIpProtectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIpProtectionResponse setBody(UpdateIpProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpProtectionResponseBody getBody() {
        return this.body;
    }

}
