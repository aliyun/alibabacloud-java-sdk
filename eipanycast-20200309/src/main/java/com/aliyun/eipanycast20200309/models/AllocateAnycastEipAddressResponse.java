// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class AllocateAnycastEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateAnycastEipAddressResponseBody body;

    public static AllocateAnycastEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateAnycastEipAddressResponse self = new AllocateAnycastEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public AllocateAnycastEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateAnycastEipAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateAnycastEipAddressResponse setBody(AllocateAnycastEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

}
