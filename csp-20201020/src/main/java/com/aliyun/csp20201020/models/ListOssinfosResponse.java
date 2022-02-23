// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListOssinfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOssinfosResponseBody body;

    public static ListOssinfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOssinfosResponse self = new ListOssinfosResponse();
        return TeaModel.build(map, self);
    }

    public ListOssinfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOssinfosResponse setBody(ListOssinfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOssinfosResponseBody getBody() {
        return this.body;
    }

}
