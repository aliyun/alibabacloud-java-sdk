// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteOneMetaSqlTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOneMetaSqlTemplateResponseBody body;

    public static DeleteOneMetaSqlTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOneMetaSqlTemplateResponse self = new DeleteOneMetaSqlTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOneMetaSqlTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOneMetaSqlTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOneMetaSqlTemplateResponse setBody(DeleteOneMetaSqlTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOneMetaSqlTemplateResponseBody getBody() {
        return this.body;
    }

}
