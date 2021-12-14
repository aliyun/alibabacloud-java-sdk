// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpgradeLindormInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeLindormInstanceResponseBody body;

    public static UpgradeLindormInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeLindormInstanceResponse self = new UpgradeLindormInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeLindormInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeLindormInstanceResponse setBody(UpgradeLindormInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeLindormInstanceResponseBody getBody() {
        return this.body;
    }

}
