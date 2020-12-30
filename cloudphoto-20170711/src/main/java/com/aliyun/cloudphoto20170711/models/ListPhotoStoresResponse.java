// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListPhotoStoresResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPhotoStoresResponseBody body;

    public static ListPhotoStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhotoStoresResponse self = new ListPhotoStoresResponse();
        return TeaModel.build(map, self);
    }

    public ListPhotoStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPhotoStoresResponse setBody(ListPhotoStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhotoStoresResponseBody getBody() {
        return this.body;
    }

}
