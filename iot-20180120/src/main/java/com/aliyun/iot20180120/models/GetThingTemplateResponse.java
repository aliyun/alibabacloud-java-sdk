// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetThingTemplateResponseBody body;

    public static GetThingTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThingTemplateResponse self = new GetThingTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetThingTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThingTemplateResponse setBody(GetThingTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThingTemplateResponseBody getBody() {
        return this.body;
    }

}
