// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateExtCodeSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExtCodeSignResponseBody body;

    public static UpdateExtCodeSignResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtCodeSignResponse self = new UpdateExtCodeSignResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExtCodeSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExtCodeSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExtCodeSignResponse setBody(UpdateExtCodeSignResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExtCodeSignResponseBody getBody() {
        return this.body;
    }

}
