// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentThemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataAgentThemeResponseBody body;

    public static CreateDataAgentThemeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentThemeResponse self = new CreateDataAgentThemeResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentThemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataAgentThemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataAgentThemeResponse setBody(CreateDataAgentThemeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataAgentThemeResponseBody getBody() {
        return this.body;
    }

}
