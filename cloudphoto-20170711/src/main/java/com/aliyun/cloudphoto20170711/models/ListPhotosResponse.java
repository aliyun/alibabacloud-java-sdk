// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPhotosResponseBody body;

    public static ListPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhotosResponse self = new ListPhotosResponse();
        return TeaModel.build(map, self);
    }

    public ListPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPhotosResponse setBody(ListPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhotosResponseBody getBody() {
        return this.body;
    }

}
