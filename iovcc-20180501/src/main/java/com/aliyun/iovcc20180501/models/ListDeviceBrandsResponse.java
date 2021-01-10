// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceBrandsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceBrandsResponseBody body;

    public static ListDeviceBrandsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBrandsResponse self = new ListDeviceBrandsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceBrandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceBrandsResponse setBody(ListDeviceBrandsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceBrandsResponseBody getBody() {
        return this.body;
    }

}
