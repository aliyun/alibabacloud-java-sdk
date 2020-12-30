// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ListFaceImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFaceImagesResponseBody body;

    public static ListFaceImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFaceImagesResponse self = new ListFaceImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListFaceImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFaceImagesResponse setBody(ListFaceImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFaceImagesResponseBody getBody() {
        return this.body;
    }

}
