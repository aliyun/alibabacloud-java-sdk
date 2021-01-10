// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateSmarttagTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmarttagTemplateResponseBody body;

    public static UpdateSmarttagTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmarttagTemplateResponse self = new UpdateSmarttagTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmarttagTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmarttagTemplateResponse setBody(UpdateSmarttagTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmarttagTemplateResponseBody getBody() {
        return this.body;
    }

}
