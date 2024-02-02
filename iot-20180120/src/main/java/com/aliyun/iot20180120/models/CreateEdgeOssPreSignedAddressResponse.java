// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeOssPreSignedAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEdgeOssPreSignedAddressResponseBody body;

    public static CreateEdgeOssPreSignedAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeOssPreSignedAddressResponse self = new CreateEdgeOssPreSignedAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeOssPreSignedAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeOssPreSignedAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeOssPreSignedAddressResponse setBody(CreateEdgeOssPreSignedAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeOssPreSignedAddressResponseBody getBody() {
        return this.body;
    }

}
