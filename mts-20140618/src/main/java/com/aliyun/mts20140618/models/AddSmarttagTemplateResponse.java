// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddSmarttagTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSmarttagTemplateResponseBody body;

    public static AddSmarttagTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSmarttagTemplateResponse self = new AddSmarttagTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddSmarttagTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSmarttagTemplateResponse setBody(AddSmarttagTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSmarttagTemplateResponseBody getBody() {
        return this.body;
    }

}
