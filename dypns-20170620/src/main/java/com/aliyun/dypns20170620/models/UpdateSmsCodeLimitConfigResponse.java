// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class UpdateSmsCodeLimitConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSmsCodeLimitConfigResponseBody body;

    public static UpdateSmsCodeLimitConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsCodeLimitConfigResponse self = new UpdateSmsCodeLimitConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmsCodeLimitConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmsCodeLimitConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmsCodeLimitConfigResponse setBody(UpdateSmsCodeLimitConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmsCodeLimitConfigResponseBody getBody() {
        return this.body;
    }

}
