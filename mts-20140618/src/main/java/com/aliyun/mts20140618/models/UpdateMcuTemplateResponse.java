// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMcuTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMcuTemplateResponseBody body;

    public static UpdateMcuTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcuTemplateResponse self = new UpdateMcuTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMcuTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMcuTemplateResponse setBody(UpdateMcuTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMcuTemplateResponseBody getBody() {
        return this.body;
    }

}
