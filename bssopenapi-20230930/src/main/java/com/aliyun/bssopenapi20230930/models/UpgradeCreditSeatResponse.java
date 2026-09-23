// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class UpgradeCreditSeatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeCreditSeatResponseBody body;

    public static UpgradeCreditSeatResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeCreditSeatResponse self = new UpgradeCreditSeatResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeCreditSeatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeCreditSeatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeCreditSeatResponse setBody(UpgradeCreditSeatResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeCreditSeatResponseBody getBody() {
        return this.body;
    }

}
