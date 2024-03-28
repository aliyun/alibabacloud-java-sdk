// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateIpSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIpSetResponseBody body;

    public static UpdateIpSetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpSetResponse self = new UpdateIpSetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIpSetResponse setBody(UpdateIpSetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpSetResponseBody getBody() {
        return this.body;
    }

}
