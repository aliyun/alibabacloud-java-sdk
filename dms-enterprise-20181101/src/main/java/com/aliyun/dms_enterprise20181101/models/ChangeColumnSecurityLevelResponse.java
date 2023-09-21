// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeColumnSecurityLevelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeColumnSecurityLevelResponseBody body;

    public static ChangeColumnSecurityLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeColumnSecurityLevelResponse self = new ChangeColumnSecurityLevelResponse();
        return TeaModel.build(map, self);
    }

    public ChangeColumnSecurityLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeColumnSecurityLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeColumnSecurityLevelResponse setBody(ChangeColumnSecurityLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeColumnSecurityLevelResponseBody getBody() {
        return this.body;
    }

}
