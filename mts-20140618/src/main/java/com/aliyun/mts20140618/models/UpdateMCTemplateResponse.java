// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMCTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMCTemplateResponseBody body;

    public static UpdateMCTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMCTemplateResponse self = new UpdateMCTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMCTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMCTemplateResponse setBody(UpdateMCTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMCTemplateResponseBody getBody() {
        return this.body;
    }

}
