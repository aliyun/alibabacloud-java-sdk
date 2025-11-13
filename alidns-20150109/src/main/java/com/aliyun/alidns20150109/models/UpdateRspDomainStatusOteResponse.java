// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRspDomainStatusOteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRspDomainStatusOteResponseBody body;

    public static UpdateRspDomainStatusOteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRspDomainStatusOteResponse self = new UpdateRspDomainStatusOteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRspDomainStatusOteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRspDomainStatusOteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRspDomainStatusOteResponse setBody(UpdateRspDomainStatusOteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRspDomainStatusOteResponseBody getBody() {
        return this.body;
    }

}
