// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class EditPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EditPhotosResponseBody body;

    public static EditPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        EditPhotosResponse self = new EditPhotosResponse();
        return TeaModel.build(map, self);
    }

    public EditPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditPhotosResponse setBody(EditPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public EditPhotosResponseBody getBody() {
        return this.body;
    }

}
