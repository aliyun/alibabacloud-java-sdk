// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserPictureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddFaceUserPictureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFaceUserPictureResponse setBody(AddFaceUserPictureResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceUserPictureResponseBody getBody() {
        return this.body;
    }

}
