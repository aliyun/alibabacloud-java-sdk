// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateIpSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIpSetsResponseBody body;

    public static UpdateIpSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpSetsResponse self = new UpdateIpSetsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIpSetsResponse setBody(UpdateIpSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpSetsResponseBody getBody() {
        return this.body;
    }

}
