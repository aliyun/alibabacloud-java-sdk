// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMCTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMCTemplateResponseBody body;

    public static DeleteMCTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMCTemplateResponse self = new DeleteMCTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMCTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMCTemplateResponse setBody(DeleteMCTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMCTemplateResponseBody getBody() {
        return this.body;
    }

}
