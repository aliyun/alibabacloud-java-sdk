// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListMomentPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMomentPhotosResponseBody body;

    public static ListMomentPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMomentPhotosResponse self = new ListMomentPhotosResponse();
        return TeaModel.build(map, self);
    }

    public ListMomentPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMomentPhotosResponse setBody(ListMomentPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMomentPhotosResponseBody getBody() {
        return this.body;
    }

}
