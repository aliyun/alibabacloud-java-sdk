// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class UpgradeTwoWayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpgradeTwoWayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeTwoWayResponse setBody(UpgradeTwoWayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeTwoWayResponseBody getBody() {
        return this.body;
    }

}
