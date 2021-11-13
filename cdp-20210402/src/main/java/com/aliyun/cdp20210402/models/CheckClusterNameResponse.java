// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class CheckClusterNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckClusterNameResponseBody body;

    public static CheckClusterNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckClusterNameResponse self = new CheckClusterNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckClusterNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckClusterNameResponse setBody(CheckClusterNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckClusterNameResponseBody getBody() {
        return this.body;
    }

}
