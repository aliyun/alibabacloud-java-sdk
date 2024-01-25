// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class AssociateAnycastEipAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateAnycastEipAddressResponseBody body;

    public static AssociateAnycastEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateAnycastEipAddressResponse self = new AssociateAnycastEipAddressResponse();
        return TeaModel.build(map, self);
    }

    public AssociateAnycastEipAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateAnycastEipAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateAnycastEipAddressResponse setBody(AssociateAnycastEipAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

}
