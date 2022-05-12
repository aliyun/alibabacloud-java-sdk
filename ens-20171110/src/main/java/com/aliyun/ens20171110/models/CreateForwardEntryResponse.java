// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateForwardEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateForwardEntryResponseBody body;

    public static CreateForwardEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardEntryResponse self = new CreateForwardEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateForwardEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateForwardEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateForwardEntryResponse setBody(CreateForwardEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateForwardEntryResponseBody getBody() {
        return this.body;
    }

}
