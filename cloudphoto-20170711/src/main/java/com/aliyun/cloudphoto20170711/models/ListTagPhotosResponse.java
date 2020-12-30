// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListTagPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTagPhotosResponseBody body;

    public static ListTagPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagPhotosResponse self = new ListTagPhotosResponse();
        return TeaModel.build(map, self);
    }

    public ListTagPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagPhotosResponse setBody(ListTagPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagPhotosResponseBody getBody() {
        return this.body;
    }

}
