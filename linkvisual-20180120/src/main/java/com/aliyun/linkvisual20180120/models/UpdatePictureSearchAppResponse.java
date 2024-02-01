// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdatePictureSearchAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePictureSearchAppResponseBody body;

    public static UpdatePictureSearchAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePictureSearchAppResponse self = new UpdatePictureSearchAppResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePictureSearchAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePictureSearchAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePictureSearchAppResponse setBody(UpdatePictureSearchAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePictureSearchAppResponseBody getBody() {
        return this.body;
    }

}
