// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateEventDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEventDefinitionResponseBody body;

    public static UpdateEventDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventDefinitionResponse self = new UpdateEventDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventDefinitionResponse setBody(UpdateEventDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventDefinitionResponseBody getBody() {
        return this.body;
    }

}
