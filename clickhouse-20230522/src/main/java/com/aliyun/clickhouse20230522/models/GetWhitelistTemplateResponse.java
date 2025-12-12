// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class GetWhitelistTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWhitelistTemplateResponseBody body;

    public static GetWhitelistTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWhitelistTemplateResponse self = new GetWhitelistTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetWhitelistTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWhitelistTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWhitelistTemplateResponse setBody(GetWhitelistTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWhitelistTemplateResponseBody getBody() {
        return this.body;
    }

}
