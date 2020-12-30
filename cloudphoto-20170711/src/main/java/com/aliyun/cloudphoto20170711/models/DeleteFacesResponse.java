// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeleteFacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFacesResponseBody body;

    public static DeleteFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFacesResponse self = new DeleteFacesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFacesResponse setBody(DeleteFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFacesResponseBody getBody() {
        return this.body;
    }

}
