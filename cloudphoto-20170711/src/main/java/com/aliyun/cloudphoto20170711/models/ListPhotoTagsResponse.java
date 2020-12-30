// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListPhotoTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPhotoTagsResponseBody body;

    public static ListPhotoTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhotoTagsResponse self = new ListPhotoTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListPhotoTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPhotoTagsResponse setBody(ListPhotoTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhotoTagsResponseBody getBody() {
        return this.body;
    }

}
