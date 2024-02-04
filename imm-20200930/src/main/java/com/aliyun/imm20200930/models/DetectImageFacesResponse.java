// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageFacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectImageFacesResponseBody body;

    public static DetectImageFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageFacesResponse self = new DetectImageFacesResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageFacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectImageFacesResponse setBody(DetectImageFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageFacesResponseBody getBody() {
        return this.body;
    }

}
