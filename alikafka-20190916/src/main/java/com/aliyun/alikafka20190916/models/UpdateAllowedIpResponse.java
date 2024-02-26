// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateAllowedIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAllowedIpResponseBody body;

    public static UpdateAllowedIpResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAllowedIpResponse self = new UpdateAllowedIpResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAllowedIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAllowedIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAllowedIpResponse setBody(UpdateAllowedIpResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAllowedIpResponseBody getBody() {
        return this.body;
    }

}
