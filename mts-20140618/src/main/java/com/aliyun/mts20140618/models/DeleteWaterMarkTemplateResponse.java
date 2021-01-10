// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteWaterMarkTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWaterMarkTemplateResponseBody body;

    public static DeleteWaterMarkTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaterMarkTemplateResponse self = new DeleteWaterMarkTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWaterMarkTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWaterMarkTemplateResponse setBody(DeleteWaterMarkTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWaterMarkTemplateResponseBody getBody() {
        return this.body;
    }

}
