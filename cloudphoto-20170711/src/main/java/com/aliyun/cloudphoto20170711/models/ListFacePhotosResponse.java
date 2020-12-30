// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListFacePhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFacePhotosResponseBody body;

    public static ListFacePhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFacePhotosResponse self = new ListFacePhotosResponse();
        return TeaModel.build(map, self);
    }

    public ListFacePhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFacePhotosResponse setBody(ListFacePhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFacePhotosResponseBody getBody() {
        return this.body;
    }

}
