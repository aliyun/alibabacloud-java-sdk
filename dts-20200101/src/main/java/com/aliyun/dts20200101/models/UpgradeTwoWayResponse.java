// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class UpgradeTwoWayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeTwoWayResponseBody body;

    public static UpgradeTwoWayResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeTwoWayResponse self = new UpgradeTwoWayResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeTwoWayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeTwoWayResponse setBody(UpgradeTwoWayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeTwoWayResponseBody getBody() {
        return this.body;
    }

}
