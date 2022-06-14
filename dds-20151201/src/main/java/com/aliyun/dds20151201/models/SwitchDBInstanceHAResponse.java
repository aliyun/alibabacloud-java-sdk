// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceHAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchDBInstanceHAResponseBody body;

    public static SwitchDBInstanceHAResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceHAResponse self = new SwitchDBInstanceHAResponse();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceHAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchDBInstanceHAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchDBInstanceHAResponse setBody(SwitchDBInstanceHAResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchDBInstanceHAResponseBody getBody() {
        return this.body;
    }

}
