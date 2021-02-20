// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeApplicationResponseBody body;

    public static UpgradeApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeApplicationResponse self = new UpgradeApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeApplicationResponse setBody(UpgradeApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeApplicationResponseBody getBody() {
        return this.body;
    }

}
