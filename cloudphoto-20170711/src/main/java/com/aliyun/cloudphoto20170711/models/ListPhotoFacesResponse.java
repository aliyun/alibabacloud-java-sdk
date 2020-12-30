// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListPhotoFacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPhotoFacesResponseBody body;

    public static ListPhotoFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhotoFacesResponse self = new ListPhotoFacesResponse();
        return TeaModel.build(map, self);
    }

    public ListPhotoFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPhotoFacesResponse setBody(ListPhotoFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPhotoFacesResponseBody getBody() {
        return this.body;
    }

}
