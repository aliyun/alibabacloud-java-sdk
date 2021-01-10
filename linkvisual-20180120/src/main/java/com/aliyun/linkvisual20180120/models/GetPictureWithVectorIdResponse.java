// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureWithVectorIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPictureWithVectorIdResponseBody body;

    public static GetPictureWithVectorIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPictureWithVectorIdResponse self = new GetPictureWithVectorIdResponse();
        return TeaModel.build(map, self);
    }

    public GetPictureWithVectorIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPictureWithVectorIdResponse setBody(GetPictureWithVectorIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPictureWithVectorIdResponseBody getBody() {
        return this.body;
    }

}
