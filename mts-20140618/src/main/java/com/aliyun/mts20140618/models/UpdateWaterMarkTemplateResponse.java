// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateWaterMarkTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWaterMarkTemplateResponseBody body;

    public static UpdateWaterMarkTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaterMarkTemplateResponse self = new UpdateWaterMarkTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWaterMarkTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWaterMarkTemplateResponse setBody(UpdateWaterMarkTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWaterMarkTemplateResponseBody getBody() {
        return this.body;
    }

}
