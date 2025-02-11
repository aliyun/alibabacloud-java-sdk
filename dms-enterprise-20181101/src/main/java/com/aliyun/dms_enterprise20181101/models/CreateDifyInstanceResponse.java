// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDifyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDifyInstanceResponseBody body;

    public static CreateDifyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDifyInstanceResponse self = new CreateDifyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDifyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDifyInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDifyInstanceResponse setBody(CreateDifyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDifyInstanceResponseBody getBody() {
        return this.body;
    }

}
