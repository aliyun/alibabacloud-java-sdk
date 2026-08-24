// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateOneMetaSqlTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOneMetaSqlTemplateResponseBody body;

    public static UpdateOneMetaSqlTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOneMetaSqlTemplateResponse self = new UpdateOneMetaSqlTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOneMetaSqlTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOneMetaSqlTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOneMetaSqlTemplateResponse setBody(UpdateOneMetaSqlTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOneMetaSqlTemplateResponseBody getBody() {
        return this.body;
    }

}
