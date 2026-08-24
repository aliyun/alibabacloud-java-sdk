// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateOneMetaSqlTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOneMetaSqlTemplateResponseBody body;

    public static CreateOneMetaSqlTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOneMetaSqlTemplateResponse self = new CreateOneMetaSqlTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateOneMetaSqlTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOneMetaSqlTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOneMetaSqlTemplateResponse setBody(CreateOneMetaSqlTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOneMetaSqlTemplateResponseBody getBody() {
        return this.body;
    }

}
