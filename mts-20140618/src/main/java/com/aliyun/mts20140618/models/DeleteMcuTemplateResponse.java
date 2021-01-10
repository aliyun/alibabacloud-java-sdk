// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMcuTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMcuTemplateResponseBody body;

    public static DeleteMcuTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcuTemplateResponse self = new DeleteMcuTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcuTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcuTemplateResponse setBody(DeleteMcuTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcuTemplateResponseBody getBody() {
        return this.body;
    }

}
