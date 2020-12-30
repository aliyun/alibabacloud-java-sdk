// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListFacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFacesResponseBody body;

    public static ListFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFacesResponse self = new ListFacesResponse();
        return TeaModel.build(map, self);
    }

    public ListFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFacesResponse setBody(ListFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFacesResponseBody getBody() {
        return this.body;
    }

}
