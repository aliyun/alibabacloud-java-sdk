// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CompareImageFacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CompareImageFacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompareImageFacesResponse setBody(CompareImageFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareImageFacesResponseBody getBody() {
        return this.body;
    }

}
