// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateSecurityLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecurityLevelResponseBody body;

    public static CreateSecurityLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityLevelResponse self = new CreateSecurityLevelResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecurityLevelResponse setBody(CreateSecurityLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityLevelResponseBody getBody() {
        return this.body;
    }

}
