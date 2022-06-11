// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePublicWhiteIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePublicWhiteIpsResponseBody body;

    public static UpdatePublicWhiteIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicWhiteIpsResponse self = new UpdatePublicWhiteIpsResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePublicWhiteIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePublicWhiteIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePublicWhiteIpsResponse setBody(UpdatePublicWhiteIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePublicWhiteIpsResponseBody getBody() {
        return this.body;
    }

}
