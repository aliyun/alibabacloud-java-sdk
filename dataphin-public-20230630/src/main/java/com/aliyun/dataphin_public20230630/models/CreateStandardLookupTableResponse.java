// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardLookupTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStandardLookupTableResponseBody body;

    public static CreateStandardLookupTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardLookupTableResponse self = new CreateStandardLookupTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateStandardLookupTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStandardLookupTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStandardLookupTableResponse setBody(CreateStandardLookupTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStandardLookupTableResponseBody getBody() {
        return this.body;
    }

}
