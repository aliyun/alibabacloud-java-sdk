// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateInstanceIpWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceIpWhiteListResponseBody body;

    public static UpdateInstanceIpWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceIpWhiteListResponse self = new UpdateInstanceIpWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceIpWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceIpWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceIpWhiteListResponse setBody(UpdateInstanceIpWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceIpWhiteListResponseBody getBody() {
        return this.body;
    }

}
