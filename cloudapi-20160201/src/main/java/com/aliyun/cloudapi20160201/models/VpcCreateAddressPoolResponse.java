// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcCreateAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VpcCreateAddressPoolResponseBody body;

    public static VpcCreateAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        VpcCreateAddressPoolResponse self = new VpcCreateAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public VpcCreateAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VpcCreateAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VpcCreateAddressPoolResponse setBody(VpcCreateAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public VpcCreateAddressPoolResponseBody getBody() {
        return this.body;
    }

}
