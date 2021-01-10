// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountDeviceBrandsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountDeviceBrandsResponseBody body;

    public static CountDeviceBrandsResponse build(java.util.Map<String, ?> map) throws Exception {
        CountDeviceBrandsResponse self = new CountDeviceBrandsResponse();
        return TeaModel.build(map, self);
    }

    public CountDeviceBrandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountDeviceBrandsResponse setBody(CountDeviceBrandsResponseBody body) {
        this.body = body;
        return this;
    }
    public CountDeviceBrandsResponseBody getBody() {
        return this.body;
    }

}
