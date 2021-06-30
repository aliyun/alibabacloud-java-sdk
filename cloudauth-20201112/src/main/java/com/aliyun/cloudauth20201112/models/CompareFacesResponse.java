// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class CompareFacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompareFacesResponseBody body;

    public static CompareFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareFacesResponse self = new CompareFacesResponse();
        return TeaModel.build(map, self);
    }

    public CompareFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareFacesResponse setBody(CompareFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareFacesResponseBody getBody() {
        return this.body;
    }

}
