// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteEventDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEventDefinitionResponseBody body;

    public static DeleteEventDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventDefinitionResponse self = new DeleteEventDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventDefinitionResponse setBody(DeleteEventDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventDefinitionResponseBody getBody() {
        return this.body;
    }

}
