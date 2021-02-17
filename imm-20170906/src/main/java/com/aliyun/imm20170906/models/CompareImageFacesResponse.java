// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CompareImageFacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompareImageFacesResponseBody body;

    public static CompareImageFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareImageFacesResponse self = new CompareImageFacesResponse();
        return TeaModel.build(map, self);
    }

    public CompareImageFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareImageFacesResponse setBody(CompareImageFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareImageFacesResponseBody getBody() {
        return this.body;
    }

}
