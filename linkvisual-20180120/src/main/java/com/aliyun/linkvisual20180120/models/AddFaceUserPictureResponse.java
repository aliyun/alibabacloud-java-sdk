// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserPictureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddFaceUserPictureResponseBody body;

    public static AddFaceUserPictureResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserPictureResponse self = new AddFaceUserPictureResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceUserPictureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceUserPictureResponse setBody(AddFaceUserPictureResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceUserPictureResponseBody getBody() {
        return this.body;
    }

}
