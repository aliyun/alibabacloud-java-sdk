// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateSecurityClassifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecurityClassifyResponseBody body;

    public static CreateSecurityClassifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityClassifyResponse self = new CreateSecurityClassifyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityClassifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityClassifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecurityClassifyResponse setBody(CreateSecurityClassifyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityClassifyResponseBody getBody() {
        return this.body;
    }

}
