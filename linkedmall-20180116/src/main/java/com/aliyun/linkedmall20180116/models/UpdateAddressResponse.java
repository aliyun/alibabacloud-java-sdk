// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class UpdateAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAddressResponseBody body;

    public static UpdateAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAddressResponse self = new UpdateAddressResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAddressResponse setBody(UpdateAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAddressResponseBody getBody() {
        return this.body;
    }

}
