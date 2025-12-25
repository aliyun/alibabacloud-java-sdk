// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateWhitelistTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWhitelistTemplateResponseBody body;

    public static CreateWhitelistTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistTemplateResponse self = new CreateWhitelistTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWhitelistTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWhitelistTemplateResponse setBody(CreateWhitelistTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWhitelistTemplateResponseBody getBody() {
        return this.body;
    }

}
