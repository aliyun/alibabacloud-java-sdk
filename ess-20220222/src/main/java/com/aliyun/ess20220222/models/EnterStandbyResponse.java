// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class EnterStandbyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterStandbyResponseBody body;

    public static EnterStandbyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterStandbyResponse self = new EnterStandbyResponse();
        return TeaModel.build(map, self);
    }

    public EnterStandbyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterStandbyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterStandbyResponse setBody(EnterStandbyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterStandbyResponseBody getBody() {
        return this.body;
    }

}
