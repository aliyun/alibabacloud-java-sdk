// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439.models;

import com.aliyun.tea.*;

public class SubstractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Integer body;

    public static SubstractResponse build(java.util.Map<String, ?> map) throws Exception {
        SubstractResponse self = new SubstractResponse();
        return TeaModel.build(map, self);
    }

    public SubstractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubstractResponse setBody(Integer body) {
        this.body = body;
        return this;
    }
    public Integer getBody() {
        return this.body;
    }

}
