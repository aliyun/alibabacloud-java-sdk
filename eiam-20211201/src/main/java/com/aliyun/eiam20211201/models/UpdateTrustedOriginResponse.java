// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateTrustedOriginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTrustedOriginResponseBody body;

    public static UpdateTrustedOriginResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrustedOriginResponse self = new UpdateTrustedOriginResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrustedOriginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrustedOriginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrustedOriginResponse setBody(UpdateTrustedOriginResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrustedOriginResponseBody getBody() {
        return this.body;
    }

}
