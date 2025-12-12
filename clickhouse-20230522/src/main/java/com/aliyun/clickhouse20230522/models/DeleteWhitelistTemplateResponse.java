// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteWhitelistTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWhitelistTemplateResponseBody body;

    public static DeleteWhitelistTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhitelistTemplateResponse self = new DeleteWhitelistTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWhitelistTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWhitelistTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWhitelistTemplateResponse setBody(DeleteWhitelistTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWhitelistTemplateResponseBody getBody() {
        return this.body;
    }

}
