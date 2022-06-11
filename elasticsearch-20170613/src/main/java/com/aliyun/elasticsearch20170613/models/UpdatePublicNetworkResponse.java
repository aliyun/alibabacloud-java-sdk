// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePublicNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePublicNetworkResponseBody body;

    public static UpdatePublicNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicNetworkResponse self = new UpdatePublicNetworkResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePublicNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePublicNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePublicNetworkResponse setBody(UpdatePublicNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePublicNetworkResponseBody getBody() {
        return this.body;
    }

}
