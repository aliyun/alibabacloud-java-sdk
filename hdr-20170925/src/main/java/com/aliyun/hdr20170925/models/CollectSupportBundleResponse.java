// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CollectSupportBundleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CollectSupportBundleResponseBody body;

    public static CollectSupportBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        CollectSupportBundleResponse self = new CollectSupportBundleResponse();
        return TeaModel.build(map, self);
    }

    public CollectSupportBundleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CollectSupportBundleResponse setBody(CollectSupportBundleResponseBody body) {
        this.body = body;
        return this;
    }
    public CollectSupportBundleResponseBody getBody() {
        return this.body;
    }

}
