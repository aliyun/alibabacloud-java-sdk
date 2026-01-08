// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddAuditViberOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAuditViberOpenResponseBody body;

    public static AddAuditViberOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAuditViberOpenResponse self = new AddAuditViberOpenResponse();
        return TeaModel.build(map, self);
    }

    public AddAuditViberOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAuditViberOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAuditViberOpenResponse setBody(AddAuditViberOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAuditViberOpenResponseBody getBody() {
        return this.body;
    }

}
