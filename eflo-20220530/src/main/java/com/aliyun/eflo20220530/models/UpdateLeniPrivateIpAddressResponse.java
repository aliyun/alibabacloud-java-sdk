// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateLeniPrivateIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLeniPrivateIpAddressResponseBody body;

    public static UpdateLeniPrivateIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLeniPrivateIpAddressResponse self = new UpdateLeniPrivateIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLeniPrivateIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLeniPrivateIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLeniPrivateIpAddressResponse setBody(UpdateLeniPrivateIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLeniPrivateIpAddressResponseBody getBody() {
        return this.body;
    }

}
