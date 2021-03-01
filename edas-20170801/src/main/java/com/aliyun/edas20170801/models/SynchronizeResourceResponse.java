// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class SynchronizeResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SynchronizeResourceResponseBody body;

    public static SynchronizeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeResourceResponse self = new SynchronizeResourceResponse();
        return TeaModel.build(map, self);
    }

    public SynchronizeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SynchronizeResourceResponse setBody(SynchronizeResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SynchronizeResourceResponseBody getBody() {
        return this.body;
    }

}
