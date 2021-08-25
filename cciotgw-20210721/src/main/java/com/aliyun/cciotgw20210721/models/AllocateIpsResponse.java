// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AllocateIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllocateIpsResponseBody body;

    public static AllocateIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpsResponse self = new AllocateIpsResponse();
        return TeaModel.build(map, self);
    }

    public AllocateIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateIpsResponse setBody(AllocateIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateIpsResponseBody getBody() {
        return this.body;
    }

}
