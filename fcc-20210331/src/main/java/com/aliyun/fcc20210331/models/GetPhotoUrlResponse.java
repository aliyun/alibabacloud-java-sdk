// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetPhotoUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhotoUrlResponseBody body;

    public static GetPhotoUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhotoUrlResponse self = new GetPhotoUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetPhotoUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhotoUrlResponse setBody(GetPhotoUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhotoUrlResponseBody getBody() {
        return this.body;
    }

}
