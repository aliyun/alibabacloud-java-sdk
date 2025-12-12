// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class UpdateWhitelistTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWhitelistTemplateResponseBody body;

    public static UpdateWhitelistTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhitelistTemplateResponse self = new UpdateWhitelistTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWhitelistTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWhitelistTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWhitelistTemplateResponse setBody(UpdateWhitelistTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWhitelistTemplateResponseBody getBody() {
        return this.body;
    }

}
