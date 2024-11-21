// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginProtectionIpWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOriginProtectionIpWhiteListResponseBody body;

    public static UpdateOriginProtectionIpWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOriginProtectionIpWhiteListResponse self = new UpdateOriginProtectionIpWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOriginProtectionIpWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOriginProtectionIpWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOriginProtectionIpWhiteListResponse setBody(UpdateOriginProtectionIpWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOriginProtectionIpWhiteListResponseBody getBody() {
        return this.body;
    }

}
