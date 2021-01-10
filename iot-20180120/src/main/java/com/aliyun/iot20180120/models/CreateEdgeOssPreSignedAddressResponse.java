// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeOssPreSignedAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateEdgeOssPreSignedAddressResponse setBody(CreateEdgeOssPreSignedAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeOssPreSignedAddressResponseBody getBody() {
        return this.body;
    }

}
