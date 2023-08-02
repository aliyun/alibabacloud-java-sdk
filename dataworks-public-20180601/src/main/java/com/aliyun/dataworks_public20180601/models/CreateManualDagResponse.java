// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class CreateManualDagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateManualDagResponseBody body;

    public static CreateManualDagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateManualDagResponse self = new CreateManualDagResponse();
        return TeaModel.build(map, self);
    }

    public CreateManualDagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateManualDagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateManualDagResponse setBody(CreateManualDagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateManualDagResponseBody getBody() {
        return this.body;
    }

}
