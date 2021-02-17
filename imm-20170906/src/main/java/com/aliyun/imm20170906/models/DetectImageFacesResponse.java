// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageFacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DetectImageFacesResponse setBody(DetectImageFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageFacesResponseBody getBody() {
        return this.body;
    }

}
