// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DissociateIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateIpAddressResponseBody body;

    public static DissociateIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateIpAddressResponse self = new DissociateIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public DissociateIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateIpAddressResponse setBody(DissociateIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateIpAddressResponseBody getBody() {
        return this.body;
    }

}
