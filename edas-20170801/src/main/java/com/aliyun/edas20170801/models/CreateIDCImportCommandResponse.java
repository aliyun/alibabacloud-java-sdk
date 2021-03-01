// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateIDCImportCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIDCImportCommandResponseBody body;

    public static CreateIDCImportCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIDCImportCommandResponse self = new CreateIDCImportCommandResponse();
        return TeaModel.build(map, self);
    }

    public CreateIDCImportCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIDCImportCommandResponse setBody(CreateIDCImportCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIDCImportCommandResponseBody getBody() {
        return this.body;
    }

}
