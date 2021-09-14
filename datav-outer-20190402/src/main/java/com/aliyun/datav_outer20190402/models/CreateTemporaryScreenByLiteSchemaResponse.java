// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateTemporaryScreenByLiteSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTemporaryScreenByLiteSchemaResponseBody body;

    public static CreateTemporaryScreenByLiteSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTemporaryScreenByLiteSchemaResponse self = new CreateTemporaryScreenByLiteSchemaResponse();
        return TeaModel.build(map, self);
    }

    public CreateTemporaryScreenByLiteSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTemporaryScreenByLiteSchemaResponse setBody(CreateTemporaryScreenByLiteSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTemporaryScreenByLiteSchemaResponseBody getBody() {
        return this.body;
    }

}
