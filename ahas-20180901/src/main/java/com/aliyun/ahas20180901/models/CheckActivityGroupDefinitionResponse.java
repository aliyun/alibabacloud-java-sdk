// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CheckActivityGroupDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckActivityGroupDefinitionResponseBody body;

    public static CheckActivityGroupDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckActivityGroupDefinitionResponse self = new CheckActivityGroupDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public CheckActivityGroupDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckActivityGroupDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckActivityGroupDefinitionResponse setBody(CheckActivityGroupDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckActivityGroupDefinitionResponseBody getBody() {
        return this.body;
    }

}
